package typingsSlinky.sanitizeHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllowedAttribute = java.lang.String | typingsSlinky.sanitizeHtml.anon.Multiple
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Transformer = js.Function2[
    /* tagName */ java.lang.String, 
    /* attribs */ typingsSlinky.sanitizeHtml.mod.Attributes, 
    typingsSlinky.sanitizeHtml.mod.Tag
  ]
}
