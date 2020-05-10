package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableProperties width extend GenericProperties
  */
@js.native
trait IGenericVariableProperties extends IGenericProperties {
  /**
    * Comment related to the variable.
    * >> This parameter is optional.
    */
  var qComment: js.UndefOr[String] = js.native
  /**
    * Definition of the variable.
    */
  var qDefinition: String = js.native
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The variable value will be persisted in the bookmark.
    * The value of a variable can affect the state of the selections.
    * Script variables cannot be persisted in the bookmark.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean = js.native
  /**
    * Name of the variable.
    * The name must be unique.
    * >> This parameter is mandatory.
    */
  var qName: String = js.native
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentation: js.UndefOr[IFieldAttributes] = js.native
}

object IGenericVariableProperties {
  @scala.inline
  def apply(qDefinition: String, qIncludeInBookmark: Boolean, qInfo: INxInfo, qName: String): IGenericVariableProperties = {
    val __obj = js.Dynamic.literal(qDefinition = qDefinition.asInstanceOf[js.Any], qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableProperties]
  }
  @scala.inline
  implicit class IGenericVariablePropertiesOps[Self <: IGenericVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIncludeInBookmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIncludeInBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(js.undefined)
        ret
    }
    @scala.inline
    def withQNumberPresentation(value: IFieldAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNumberPresentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentation")(js.undefined)
        ret
    }
  }
  
}

