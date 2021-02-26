package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Abstract
import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingUtilsMod {
  
  @JSImport("inversify/dts/utils/binding_utils", "multiBindToService")
  @js.native
  def multiBindToService(container: Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
}
