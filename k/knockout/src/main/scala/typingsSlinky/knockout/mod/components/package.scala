package typingsSlinky.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object components {
  type CreateViewModel = js.Function2[
    /* params */ typingsSlinky.knockout.mod.components.ViewModelParams, 
    /* componentInfo */ typingsSlinky.knockout.mod.components.ComponentInfo, 
    typingsSlinky.knockout.mod.components.ViewModel
  ]
  type TemplateConfig = java.lang.String | js.Array[org.scalajs.dom.raw.Node] | org.scalajs.dom.raw.DocumentFragment | typingsSlinky.knockout.mod.components.TemplateElement
  type ViewModelParams = org.scalablytyped.runtime.StringDictionary[js.Any]
}
