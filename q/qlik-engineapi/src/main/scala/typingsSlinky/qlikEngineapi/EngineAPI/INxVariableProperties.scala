package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxVariableProperties...
  */
@js.native
trait INxVariableProperties extends js.Object {
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The value of a variable can affect the state of the selections.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean = js.native
  /**
    * Name of the variable.
    */
  var qName: String = js.native
  /**
    * Defines the format of the value of a variable.
    */
  var qNumberPresentation: IFieldAttributes = js.native
  /**
    * List of enumerations.
    * This property is used if qUsePredefListedValues is set to true.
    */
  var qPreDefinedList: js.Array[String] = js.native
  /**
    * The value of a variable can be an enumeration.
    * Set this property to true to reflect the predefined values in an enumeration.
    */
  var qUsePredefListedValues: Boolean = js.native
}

object INxVariableProperties {
  @scala.inline
  def apply(
    qIncludeInBookmark: Boolean,
    qName: String,
    qNumberPresentation: IFieldAttributes,
    qPreDefinedList: js.Array[String],
    qUsePredefListedValues: Boolean
  ): INxVariableProperties = {
    val __obj = js.Dynamic.literal(qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumberPresentation = qNumberPresentation.asInstanceOf[js.Any], qPreDefinedList = qPreDefinedList.asInstanceOf[js.Any], qUsePredefListedValues = qUsePredefListedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxVariableProperties]
  }
  @scala.inline
  implicit class INxVariablePropertiesOps[Self <: INxVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withQNumberPresentation(value: IFieldAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberPresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPreDefinedList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPreDefinedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUsePredefListedValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUsePredefListedValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

