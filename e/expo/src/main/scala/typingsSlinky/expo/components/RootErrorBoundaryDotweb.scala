package typingsSlinky.expo.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expo.rootErrorBoundaryWebMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootErrorBoundaryDotweb
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

