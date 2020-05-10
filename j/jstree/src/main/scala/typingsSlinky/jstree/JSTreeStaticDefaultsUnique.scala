package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStaticDefaultsUnique extends js.Object {
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: Boolean = js.native
  /**
    * Indicates if white space should be trimmed before the comparison. Default is `false`.
    * @name $.jstree.defaults.unique.trim_whitespace
    * @plugin unique
    */
  var trim_whitespace: Boolean = js.native
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: String, counter: Double): String = js.native
}

object JSTreeStaticDefaultsUnique {
  @scala.inline
  def apply(case_sensitive: Boolean, duplicate: (String, Double) => String, trim_whitespace: Boolean): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal(case_sensitive = case_sensitive.asInstanceOf[js.Any], duplicate = js.Any.fromFunction2(duplicate), trim_whitespace = trim_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
  @scala.inline
  implicit class JSTreeStaticDefaultsUniqueOps[Self <: JSTreeStaticDefaultsUnique] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCase_sensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_sensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicate(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrim_whitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim_whitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

