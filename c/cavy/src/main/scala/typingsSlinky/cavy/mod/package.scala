package typingsSlinky.cavy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RefCallback = js.Function1[/* element */ slinky.core.facade.ReactElement | scala.Null, scala.Unit]
  
  type TestHookGenerator = typingsSlinky.cavy.mod.TestHookGeneratorWithRefCallback with typingsSlinky.cavy.mod.TestHookGeneratorWithRefObject
  
  type TestHookGeneratorWithRefCallback = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[typingsSlinky.cavy.mod.RefCallback], 
    typingsSlinky.cavy.mod.RefCallback
  ]
  
  type TestHookGeneratorWithRefObject = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[slinky.core.facade.ReactRef[js.Any]], 
    slinky.core.facade.ReactRef[js.Any]
  ]
  
  type WithTestHook[P /* <: js.Object */] = P with typingsSlinky.cavy.anon.GenerateTestHook
}
