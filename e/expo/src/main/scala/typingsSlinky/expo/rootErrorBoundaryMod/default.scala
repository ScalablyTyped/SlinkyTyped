package typingsSlinky.expo.rootErrorBoundaryMod

import typingsSlinky.expo.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
@js.native
class default protected () extends RootErrorBoundary {
  def this(props: Props) = this()
}
/* static members */
@JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Test this by adding `throw new Error('example')` to your root component
    * when the AppLoading component is rendered.
    */
  def getDerivedStateFromError(_error: js.Error): Error | Null = js.native
}
