package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition for an object within a data source.
  */
@js.native
trait SchemaObjectDefinition extends js.Object {
  /**
    * Name for the object, which then defines its type. Item indexing requests
    * should set the objectType field equal to this value. For example, if
    * *name* is *Document*, then indexing requests for items of type Document
    * should set objectType equal to *Document*. Each object definition must be
    * uniquely named within a schema. The name must start with a letter and can
    * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is
    * 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The optional object-specific options.
    */
  var options: js.UndefOr[SchemaObjectOptions] = js.native
  /**
    * The property definitions for the object. The maximum number of elements
    * is 1000.
    */
  var propertyDefinitions: js.UndefOr[js.Array[SchemaPropertyDefinition]] = js.native
}

object SchemaObjectDefinition {
  @scala.inline
  def apply(): SchemaObjectDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectDefinition]
  }
  @scala.inline
  implicit class SchemaObjectDefinitionOps[Self <: SchemaObjectDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
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
    def withOptions(value: SchemaObjectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyDefinitions(value: js.Array[SchemaPropertyDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDefinitions")(js.undefined)
        ret
    }
  }
  
}

