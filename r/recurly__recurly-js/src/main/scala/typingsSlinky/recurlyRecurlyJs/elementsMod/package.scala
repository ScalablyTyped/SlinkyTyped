package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object elementsMod {
  
  type Attach[ElementType] = js.Function1[/* el */ java.lang.String | org.scalajs.dom.raw.HTMLElement, ElementType]
  
  type Elements = js.Function0[typingsSlinky.recurlyRecurlyJs.elementsMod.ElementsInstance]
  
  type ElementsInstanceEvents = typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit
}
