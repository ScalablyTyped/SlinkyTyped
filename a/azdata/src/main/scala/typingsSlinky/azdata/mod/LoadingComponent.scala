package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingComponent extends Component {
  
  /**
    * The component displayed when the loading property is false
    */
  var component: Component = js.native
  
  /**
    * Whether to show the loading spinner instead of the contained component. True by default
    */
  var loading: Boolean = js.native
}
