package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecastJSPlugin extends INavigationEnginePlugin {
  /**
    * Reference to the Recast library
    */
  var bjsRECAST: js.Any = js.native
  /**
    * the first navmesh created. We might extend this to support multiple navmeshes
    */
  var navMesh: js.Any = js.native
}

object RecastJSPlugin {
  @scala.inline
  def apply(
    bjsRECAST: js.Any,
    computePath: (Vector3, Vector3) => js.Array[Vector3],
    createCrowd: (Double, Double, Scene) => ICrowd,
    createDebugNavMesh: Scene => Mesh,
    createNavMesh: (js.Array[Mesh], INavMeshParameters) => Unit,
    dispose: () => Unit,
    getClosestPoint: Vector3 => Vector3,
    getDefaultQueryExtent: () => Vector3,
    getRandomPointAround: (Vector3, Double) => Vector3,
    isSupported: () => Boolean,
    moveAlong: (Vector3, Vector3) => Vector3,
    name: String,
    navMesh: js.Any,
    setDefaultQueryExtent: Vector3 => Unit
  ): RecastJSPlugin = {
    val __obj = js.Dynamic.literal(bjsRECAST = bjsRECAST.asInstanceOf[js.Any], computePath = js.Any.fromFunction2(computePath), createCrowd = js.Any.fromFunction3(createCrowd), createDebugNavMesh = js.Any.fromFunction1(createDebugNavMesh), createNavMesh = js.Any.fromFunction2(createNavMesh), dispose = js.Any.fromFunction0(dispose), getClosestPoint = js.Any.fromFunction1(getClosestPoint), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getRandomPointAround = js.Any.fromFunction2(getRandomPointAround), isSupported = js.Any.fromFunction0(isSupported), moveAlong = js.Any.fromFunction2(moveAlong), name = name.asInstanceOf[js.Any], navMesh = navMesh.asInstanceOf[js.Any], setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent))
    __obj.asInstanceOf[RecastJSPlugin]
  }
  @scala.inline
  implicit class RecastJSPluginOps[Self <: RecastJSPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBjsRECAST(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bjsRECAST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navMesh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

