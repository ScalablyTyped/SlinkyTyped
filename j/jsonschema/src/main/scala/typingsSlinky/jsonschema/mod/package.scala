package typingsSlinky.jsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CustomFormat = js.Function1[/* input */ js.Any, scala.Boolean]
  
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typingsSlinky.jsonschema.mod.Schema, 
    /* options */ typingsSlinky.jsonschema.mod.Options, 
    /* ctx */ typingsSlinky.jsonschema.mod.SchemaContext, 
    java.lang.String | typingsSlinky.jsonschema.mod.ValidatorResult
  ]
  
  type PreValidatePropertyFunction = js.Function5[
    /* instance */ js.Any, 
    /* key */ java.lang.String, 
    /* schema */ typingsSlinky.jsonschema.mod.Schema, 
    /* options */ typingsSlinky.jsonschema.mod.Options, 
    /* ctx */ typingsSlinky.jsonschema.mod.SchemaContext, 
    js.Any
  ]
  
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typingsSlinky.jsonschema.mod.Schema, 
    /* options */ typingsSlinky.jsonschema.mod.Options, 
    /* ctx */ typingsSlinky.jsonschema.mod.SchemaContext, 
    js.Any
  ]
}
