package typingsSlinky.pixiJs.PIXI.systems

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.pixiJs.PIXI.Renderer
import typingsSlinky.pixiJs.PIXI.State
import typingsSlinky.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage WebGL state machines.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait StateSystem extends System {
  /**
    * Whether current blend equation is different
    * @member {boolean} PIXI.systems.StateSystem#_blendEq
    * @protected
    */
  var _blendEq: Boolean = js.native
  /**
    * Blend mode
    * @member {number} PIXI.systems.StateSystem#blendMode
    * @default PIXI.BLEND_MODES.NONE
    * @readonly
    */
  val blendMode: Double = js.native
  /**
    * Collection of check calls
    * @member {function[]} PIXI.systems.StateSystem#checks
    * @readonly
    */
  val checks: js.Array[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * Default WebGL State
    * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
    * @readonly
    */
  val defaultState: State = js.native
  /**
    * GL context
    * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
    * @readonly
    */
  val gl: WebGLRenderingContext = js.native
  /**
    * Collection of calls
    * @member {function[]} PIXI.systems.StateSystem#map
    * @readonly
    */
  val map: js.Array[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * Polygon offset
    * @member {number} PIXI.systems.StateSystem#polygonOffset
    * @readonly
    */
  val polygonOffset: Double = js.native
  /**
    * State ID
    * @member {number} PIXI.systems.StateSystem#stateId
    * @readonly
    */
  val stateId: Double = js.native
  /**
    * Sets the state, when previous state is unknown
    *
    * @param {*} state - The state to set
    */
  def forceState(state: js.Any): Unit = js.native
  /**
    * Resets all the logic and disables the vaos
    */
  def reset(): Unit = js.native
  /**
    * Sets the current state
    *
    * @param {*} state - The state to set.
    */
  def set(state: js.Any): Unit = js.native
  /**
    * Enables or disabled blending.
    *
    * @param {boolean} value - Turn on or off webgl blending.
    */
  def setBlend(value: Boolean): Unit = js.native
  /**
    * Sets the blend mode.
    *
    * @param {number} value - The blend mode to set to.
    */
  def setBlendMode(value: Double): Unit = js.native
  /**
    * Sets whether to enable or disable cull face.
    *
    * @param {boolean} value - Turn on or off webgl cull face.
    */
  def setCullFace(value: Boolean): Unit = js.native
  /**
    * Sets whether to enable or disable depth test.
    *
    * @param {boolean} value - Turn on or off webgl depth testing.
    */
  def setDepthTest(value: Boolean): Unit = js.native
  /**
    * Sets the gl front face.
    *
    * @param {boolean} value - true is clockwise and false is counter-clockwise
    */
  def setFrontFace(value: Boolean): Unit = js.native
  /**
    * Enables or disable polygon offset fill
    *
    * @param {boolean} value - Turn on or off webgl polygon offset testing.
    */
  def setOffset(value: Boolean): Unit = js.native
  /**
    * Sets the polygon offset.
    *
    * @param {number} value - the polygon offset
    * @param {number} scale - the polygon offset scale
    */
  def setPolygonOffset(value: Double, scale: Double): Unit = js.native
  /**
    * checks to see which updates should be checked based on which settings have been activated.
    * For example, if blend is enabled then we should check the blend modes each time the state is changed
    * or if polygon fill is activated then we need to check if the polygon offset changes.
    * The idea is that we only check what we have too.
    *
    * @param {Function} func  the checking function to add or remove
    * @param {boolean} value  should the check function be added or removed.
    */
  def updateCheck(func: js.Function1[/* repeated */ js.Any, _], value: Boolean): Unit = js.native
}

object StateSystem {
  @scala.inline
  def apply(
    _blendEq: Boolean,
    blendMode: Double,
    checks: js.Array[js.Function1[/* repeated */ _, _]],
    defaultState: State,
    destroy: () => Unit,
    forceState: js.Any => Unit,
    gl: WebGLRenderingContext,
    map: js.Array[js.Function1[/* repeated */ _, _]],
    polygonOffset: Double,
    renderer: Renderer,
    reset: () => Unit,
    set: js.Any => Unit,
    setBlend: Boolean => Unit,
    setBlendMode: Double => Unit,
    setCullFace: Boolean => Unit,
    setDepthTest: Boolean => Unit,
    setFrontFace: Boolean => Unit,
    setOffset: Boolean => Unit,
    setPolygonOffset: (Double, Double) => Unit,
    stateId: Double,
    updateCheck: (js.Function1[/* repeated */ js.Any, _], Boolean) => Unit
  ): StateSystem = {
    val __obj = js.Dynamic.literal(_blendEq = _blendEq.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defaultState = defaultState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), forceState = js.Any.fromFunction1(forceState), gl = gl.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), setBlend = js.Any.fromFunction1(setBlend), setBlendMode = js.Any.fromFunction1(setBlendMode), setCullFace = js.Any.fromFunction1(setCullFace), setDepthTest = js.Any.fromFunction1(setDepthTest), setFrontFace = js.Any.fromFunction1(setFrontFace), setOffset = js.Any.fromFunction1(setOffset), setPolygonOffset = js.Any.fromFunction2(setPolygonOffset), stateId = stateId.asInstanceOf[js.Any], updateCheck = js.Any.fromFunction2(updateCheck))
    __obj.asInstanceOf[StateSystem]
  }
  @scala.inline
  implicit class StateSystemOps[Self <: StateSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_blendEq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_blendEq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: js.Array[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceState(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGl(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Array[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBlend(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBlend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBlendMode(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBlendMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCullFace(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCullFace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDepthTest(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDepthTest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFrontFace(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrontFace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPolygonOffset(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPolygonOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCheck(value: (js.Function1[/* repeated */ js.Any, _], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCheck")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

