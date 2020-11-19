package typingsSlinky.commonTags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JSTag = js.Function2[
    /* literals */ typingsSlinky.std.TemplateStringsArray, 
    /* repeated */ js.Any, 
    java.lang.String
  ]
  
  type PluginFunction = js.Function2[
    /* oldValue */ java.lang.String, 
    /* newValue */ java.lang.String, 
    typingsSlinky.commonTags.mod.TemplateTransformer[js.Any]
  ]
}
