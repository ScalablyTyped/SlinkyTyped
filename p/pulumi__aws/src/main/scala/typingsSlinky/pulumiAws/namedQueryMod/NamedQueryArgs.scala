package typingsSlinky.pulumiAws.namedQueryMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQueryArgs extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: Input[String] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: Input[String] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: js.UndefOr[Input[String]] = js.native
}

object NamedQueryArgs {
  @scala.inline
  def apply(database: Input[String], query: Input[String]): NamedQueryArgs = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQueryArgs]
  }
  @scala.inline
  implicit class NamedQueryArgsOps[Self <: NamedQueryArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkgroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workgroup")(js.undefined)
        ret
    }
  }
  
}

