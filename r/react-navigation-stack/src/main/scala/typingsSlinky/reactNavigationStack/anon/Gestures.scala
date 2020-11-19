package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.cardStackMod.GestureValues
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gestures extends js.Object {
  
  var descriptors: StackDescriptorMap = js.native
  
  var gestures: GestureValues = js.native
  
  var headerHeights: Record[String, Double] = js.native
  
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
  
  var scenes: js.Array[Scene[NavigationRoute[NavigationParams]]] = js.native
}
object Gestures {
  
  @scala.inline
  def apply(
    descriptors: StackDescriptorMap,
    gestures: GestureValues,
    headerHeights: Record[String, Double],
    routes: js.Array[NavigationRoute[NavigationParams]],
    scenes: js.Array[Scene[NavigationRoute[NavigationParams]]]
  ): Gestures = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gestures]
  }
  
  @scala.inline
  implicit class GesturesOps[Self <: Gestures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestures(value: GestureValues): Self = this.set("gestures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeights(value: Record[String, Double]): Self = this.set("headerHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenesVarargs(value: Scene[NavigationRoute[NavigationParams]]*): Self = this.set("scenes", js.Array(value :_*))
    
    @scala.inline
    def setScenes(value: js.Array[Scene[NavigationRoute[NavigationParams]]]): Self = this.set("scenes", value.asInstanceOf[js.Any])
  }
}
