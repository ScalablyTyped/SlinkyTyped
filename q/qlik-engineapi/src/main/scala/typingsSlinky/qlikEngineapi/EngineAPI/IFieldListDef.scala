package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the fields to show.
  */
@js.native
trait IFieldListDef extends js.Object {
  /**
    * Shows the fields defined on the fly if set to true.
    */
  var qShowDefinitionOnly: js.UndefOr[Boolean] = js.native
  /**
    * Shows the fields and derived fields if set to true.
    */
  var qShowDerivedFields: js.UndefOr[Boolean] = js.native
  /**
    * Shows the hidden fields if set to true.
    */
  var qShowHidden: js.UndefOr[Boolean] = js.native
  /**
    * Shows the Direct Discovery measure fields if set to true.
    */
  var qShowImplicit: js.UndefOr[Boolean] = js.native
  /**
    * Show the semantic fields if set to true.
    */
  var qShowSemantic: js.UndefOr[Boolean] = js.native
  /**
    * Shows the tables and fields present in the data model viewer if set to true.
    */
  var qShowSrcTables: js.UndefOr[Boolean] = js.native
  /**
    * Shows the system tables if set to true.
    */
  var qShowSystem: js.UndefOr[Boolean] = js.native
}

object IFieldListDef {
  @scala.inline
  def apply(): IFieldListDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldListDef]
  }
  @scala.inline
  implicit class IFieldListDefOps[Self <: IFieldListDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQShowDefinitionOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowDefinitionOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowDefinitionOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowDefinitionOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowDerivedFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowDerivedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowDerivedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowDerivedFields")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowImplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowImplicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowImplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowImplicit")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowSemantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSemantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowSemantic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSemantic")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowSrcTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSrcTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowSrcTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSrcTables")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowSystem")(js.undefined)
        ret
    }
  }
  
}

