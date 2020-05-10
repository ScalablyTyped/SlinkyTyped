package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Groups

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Aliases
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesCollection extends js.Object {
  // Add a alias for the group
  def insert(resource: Alias, groupKey: String): Alias = js.native
  // List all aliases for a group
  def list(groupKey: String): Aliases = js.native
  // Remove a alias for the group
  def remove(groupKey: String, alias: String): Unit = js.native
}

object AliasesCollection {
  @scala.inline
  def apply(insert: (Alias, String) => Alias, list: String => Aliases, remove: (String, String) => Unit): AliasesCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[AliasesCollection]
  }
  @scala.inline
  implicit class AliasesCollectionOps[Self <: AliasesCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: (Alias, String) => Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => Aliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

