package typingsSlinky.babylonjs.collisionCoordinatorMod

import typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh
import typingsSlinky.babylonjs.colliderMod.Collider
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollisionCoordinator extends js.Object {
  def createCollider(): Collider = js.native
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
  def init(scene: Scene): Unit = js.native
}

object ICollisionCoordinator {
  @scala.inline
  def apply(
    createCollider: () => Collider,
    getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Unit,
    init: Scene => Unit
  ): ICollisionCoordinator = {
    val __obj = js.Dynamic.literal(createCollider = js.Any.fromFunction0(createCollider), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[ICollisionCoordinator]
  }
  @scala.inline
  implicit class ICollisionCoordinatorOps[Self <: ICollisionCoordinator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCollider(value: () => Collider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCollider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNewPosition(
      value: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewPosition")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withInit(value: Scene => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

