package typingsSlinky.qtip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object QTip2 {
  
  type EventApiFunc = js.Function2[
    /* event */ org.scalajs.dom.raw.Event, 
    /* api */ typingsSlinky.qtip2.QTip2.Api, 
    scala.Unit
  ]
  
  type Target = typingsSlinky.qtip2.JQuery | js.Array[scala.Double] | java.lang.String
  
  type Text = java.lang.String | typingsSlinky.qtip2.JQuery | typingsSlinky.qtip2.QTip2.EventApiFunc | scala.Boolean | typingsSlinky.jquery.JQueryGenericPromise[js.Any]
  
  /**
    * Content property
    */
  type Title = java.lang.String | typingsSlinky.qtip2.JQuery | typingsSlinky.qtip2.QTip2.EventApiFunc | scala.Boolean | typingsSlinky.jquery.JQueryGenericPromise[js.Any]
}
