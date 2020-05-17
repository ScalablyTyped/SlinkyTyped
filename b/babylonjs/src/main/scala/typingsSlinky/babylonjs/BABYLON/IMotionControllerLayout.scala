package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.TouchPointNodeName
import typingsSlinky.babylonjs.babylonjsStrings._empty
import typingsSlinky.babylonjs.babylonjsStrings.`xr-standard`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMotionControllerLayout extends js.Object {
  /**
    * Path to load the assets. Usually relative to the base path
    */
  var assetPath: String = js.native
  /**
    * Available components (unsorted)
    */
  var components: /**
    * A map of component Ids
    */
  org.scalablytyped.runtime.StringDictionary[TouchPointNodeName] = js.native
  /**
    * Is it xr standard mapping or not
    */
  var gamepadMapping: _empty | `xr-standard` = js.native
  /**
    * Base root node of this entire model
    */
  var rootNodeName: String = js.native
  /**
    * Defines the main button component id
    */
  var selectComponentId: String = js.native
}

object IMotionControllerLayout {
  @scala.inline
  def apply(
    assetPath: String,
    components: /**
    * A map of component Ids
    */
  org.scalablytyped.runtime.StringDictionary[TouchPointNodeName],
    gamepadMapping: _empty | `xr-standard`,
    rootNodeName: String,
    selectComponentId: String
  ): IMotionControllerLayout = {
    val __obj = js.Dynamic.literal(assetPath = assetPath.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], gamepadMapping = gamepadMapping.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], selectComponentId = selectComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerLayout]
  }
  @scala.inline
  implicit class IMotionControllerLayoutOps[Self <: IMotionControllerLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(
      value: /**
      * A map of component Ids
      */
    org.scalablytyped.runtime.StringDictionary[TouchPointNodeName]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamepadMapping(value: _empty | `xr-standard`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepadMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

