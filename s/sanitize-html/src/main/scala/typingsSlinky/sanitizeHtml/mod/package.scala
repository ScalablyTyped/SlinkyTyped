package typingsSlinky.sanitizeHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllowedAttribute = java.lang.String | typingsSlinky.sanitizeHtml.AnonMultiple
  type Attributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Transformer = js.Function2[
    /* tagName */ java.lang.String, 
    /* attribs */ typingsSlinky.sanitizeHtml.mod.Attributes, 
    typingsSlinky.sanitizeHtml.mod.Tag
  ]
}
