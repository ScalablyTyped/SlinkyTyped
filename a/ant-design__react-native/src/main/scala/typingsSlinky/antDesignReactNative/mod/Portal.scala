package typingsSlinky.antDesignReactNative.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.TypeofPortalHost
import typingsSlinky.antDesignReactNative.portalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Portal allows to render a component at a different place in the parent tree.
  * You can use it to render content which should appear above other elements, similar to `Modal`.
  * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
  *
  * ## Usage
  * ```js
  * import * as React from 'react';
  * import { Portal, Text } from '@ant-design/react-native';
  *
  * export default class MyComponent extends React.Component {
  *   render() {
  *     const { visible } = this.state;
  *     return (
  *       <Portal>
  *         <Text>This is rendered at a different place</Text>
  *       </Portal>
  *     );
  *   }
  * }
  * ```
  */
@JSImport("@ant-design/react-native", "Portal")
@js.native
class Portal () extends default
/* static members */
@JSImport("@ant-design/react-native", "Portal")
@js.native
object Portal extends js.Object {
  
  var Host: TypeofPortalHost = js.native
  
  def add(e: ReactElement): Double = js.native
  
  def remove(key: Double): Unit = js.native
}
