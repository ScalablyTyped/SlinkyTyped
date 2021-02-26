package typingsSlinky.ajv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typingsSlinky.ajv.mod.Ajv = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.ajv.mod.Ajv]
  @scala.inline
  def apply(options: typingsSlinky.ajv.mod.Options): typingsSlinky.ajv.mod.Ajv = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ajv.mod.Ajv]
  
  type FormatValidator = java.lang.String | js.RegExp | (js.Function1[/* data */ java.lang.String, scala.Boolean | js.Thenable[js.Any]])
  
  @scala.inline
  def MissingRefError: typingsSlinky.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
    /* baseId */ java.lang.String, 
    /* ref */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.ajv.mod.AjvErrors.MissingRefError
  ]) = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MissingRefError").asInstanceOf[typingsSlinky.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
    /* baseId */ java.lang.String, 
    /* ref */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.ajv.mod.AjvErrors.MissingRefError
  ])]
  type MissingRefError = typingsSlinky.ajv.mod.AjvErrors.MissingRefError
  @scala.inline
  def MissingRefError_=(
    x: typingsSlinky.ajv.anon.TypeofMissingRefError with (org.scalablytyped.runtime.Instantiable3[
      /* baseId */ java.lang.String, 
      /* ref */ java.lang.String, 
      /* message */ js.UndefOr[java.lang.String], 
      typingsSlinky.ajv.mod.AjvErrors.MissingRefError
    ])
  ): scala.Unit = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("MissingRefError")(x.asInstanceOf[js.Any])
  
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | js.Thenable[js.Any]]
  
  @scala.inline
  def ValidationError: org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[typingsSlinky.ajv.mod.ErrorObject], 
    typingsSlinky.ajv.mod.AjvErrors.ValidationError
  ] = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ValidationError").asInstanceOf[org.scalablytyped.runtime.Instantiable1[
    /* errors */ js.Array[typingsSlinky.ajv.mod.ErrorObject], 
    typingsSlinky.ajv.mod.AjvErrors.ValidationError
  ]]
  type ValidationError = typingsSlinky.ajv.mod.AjvErrors.ValidationError
  @scala.inline
  def ValidationError_=(
    x: org.scalablytyped.runtime.Instantiable1[
      /* errors */ js.Array[typingsSlinky.ajv.mod.ErrorObject], 
      typingsSlinky.ajv.mod.AjvErrors.ValidationError
    ]
  ): scala.Unit = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ValidationError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def dataMetaSchema: js.Object = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$dataMetaSchema").asInstanceOf[js.Object]
  @scala.inline
  def dataMetaSchema_=(x: js.Object): scala.Unit = typingsSlinky.ajv.mod.^.asInstanceOf[js.Dynamic].updateDynamic("$dataMetaSchema")(x.asInstanceOf[js.Any])
}
