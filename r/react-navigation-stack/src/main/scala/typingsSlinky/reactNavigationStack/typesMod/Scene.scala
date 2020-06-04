package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNavigation.mod.NavigationDescriptor
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var descriptor: NavigationDescriptor[
    NavigationParams, 
    NavigationStackOptions, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ]
  var index: Double
  var isActive: Boolean
  var isStale: Boolean
  var key: String
  var route: NavigationRoute[NavigationParams]
}

object Scene {
  @scala.inline
  def apply(
    descriptor: NavigationDescriptor[
      NavigationParams, 
      NavigationStackOptions, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ],
    index: Double,
    isActive: Boolean,
    isStale: Boolean,
    key: String,
    route: NavigationRoute[NavigationParams]
  ): Scene = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
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
    def setDescriptor(
      value: NavigationDescriptor[
          NavigationParams, 
          NavigationStackOptions, 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
        ]
    ): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStale(value: Boolean): Self = this.set("isStale", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: NavigationRoute[NavigationParams]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

