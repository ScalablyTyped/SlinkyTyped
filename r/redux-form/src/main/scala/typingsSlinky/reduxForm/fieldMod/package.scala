package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fieldMod {
  
  type EventHandler[Event] = js.Function2[/* event */ Event, /* name */ js.UndefOr[java.lang.String], scala.Unit]
  
  type EventWithDataHandler[Event] = js.Function4[
    /* event */ js.UndefOr[Event], 
    /* newValue */ js.UndefOr[js.Any], 
    /* previousValue */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type Formatter = js.Function2[/* value */ js.Any, /* name */ java.lang.String, js.Any]
  
  type GenericFieldHTMLAttributes = typingsSlinky.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] | typingsSlinky.react.mod.SelectHTMLAttributes[org.scalajs.dom.raw.HTMLSelectElement] | typingsSlinky.react.mod.TextareaHTMLAttributes[org.scalajs.dom.raw.HTMLTextAreaElement]
  
  type Normalizer = js.Function4[
    /* value */ js.Any, 
    /* previousValue */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    /* previousAllValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type Parser = js.Function2[/* value */ js.Any, /* name */ java.lang.String, js.Any]
  
  type Validator = js.Function4[
    /* value */ js.Any, 
    /* allValues */ js.UndefOr[js.Any], 
    /* props */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[js.Any], 
    js.Any
  ]
}
