package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trajectory extends StObject {
  
  var _points: js.Any = js.native
  
  val _segmentLength: js.Any = js.native
  
  /**
    * Append a new point to the Trajectory.
    * NOTE: This implementation has many allocations.
    * @param point point to append to the Trajectory
    */
  def add(point: DeepImmutable[Vector3]): Unit = js.native
  
  /**
    * Get the length of the Trajectory.
    * @returns length of the Trajectory
    */
  def getLength(): Double = js.native
  
  /**
    * Create a new Trajectory with a segment length chosen to make it
    * probable that the new Trajectory will have a specified number of
    * segments. This operation is imprecise.
    * @param targetResolution number of segments desired
    * @returns new Trajectory with approximately the requested number of segments
    */
  def resampleAtTargetResolution(targetResolution: Double): Trajectory = js.native
  
  /**
    * Serialize to JSON.
    * @returns serialized JSON string
    */
  def serialize(): String = js.native
  
  /**
    * Convert Trajectory segments into tokenized representation. This
    * representation is an array of numbers where each nth number is the
    * index of the token which is most similar to the nth segment of the
    * Trajectory.
    * @param tokens list of vectors which serve as discrete tokens
    * @returns list of indices of most similar token per segment
    */
  def tokenize(tokens: DeepImmutable[js.Array[Vector3]]): js.Array[Double] = js.native
}
object Trajectory {
  
  @scala.inline
  def apply(
    _points: js.Any,
    _segmentLength: js.Any,
    add: DeepImmutable[Vector3] => Unit,
    getLength: () => Double,
    resampleAtTargetResolution: Double => Trajectory,
    serialize: () => String,
    tokenize: DeepImmutable[js.Array[Vector3]] => js.Array[Double]
  ): Trajectory = {
    val __obj = js.Dynamic.literal(_points = _points.asInstanceOf[js.Any], _segmentLength = _segmentLength.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), getLength = js.Any.fromFunction0(getLength), resampleAtTargetResolution = js.Any.fromFunction1(resampleAtTargetResolution), serialize = js.Any.fromFunction0(serialize), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Trajectory]
  }
  
  @scala.inline
  implicit class TrajectoryMutableBuilder[Self <: Trajectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: DeepImmutable[Vector3] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResampleAtTargetResolution(value: Double => Trajectory): Self = StObject.set(x, "resampleAtTargetResolution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenize(value: DeepImmutable[js.Array[Vector3]] => js.Array[Double]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_points(value: js.Any): Self = StObject.set(x, "_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_segmentLength(value: js.Any): Self = StObject.set(x, "_segmentLength", value.asInstanceOf[js.Any])
  }
}
