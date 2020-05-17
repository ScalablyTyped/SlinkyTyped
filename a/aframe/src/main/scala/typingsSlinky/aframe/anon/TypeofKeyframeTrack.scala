package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.three.mod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKeyframeTrack
  extends Instantiable3[
      /* name */ String, 
      /* times */ js.Array[js.Any], 
      /* values */ js.Array[js.Any], 
      KeyframeTrack
    ] {
  def parse(json: js.Any): typingsSlinky.three.keyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: typingsSlinky.three.keyframeTrackMod.KeyframeTrack): js.Any = js.native
}

