package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIdGenerator extends IBase {
  /** [Method] Generates and returns the next id
  		* @returns String The next id.
  		*/
  var generate: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isGenerator: js.UndefOr[Boolean] = js.native
}

object IIdGenerator {
  @scala.inline
  def apply(): IIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdGenerator]
  }
  @scala.inline
  implicit class IIdGeneratorOps[Self <: IIdGenerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGenerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGenerator")(js.undefined)
        ret
    }
  }
  
}

