package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeId extends js.Object
@JSGlobal("Microsoft.Maps.MapTypeId")
@js.native
object MapTypeId extends js.Object {
  
  /** The aerial map type which uses top-down satellite & airplane imagery. */
  @js.native
  sealed trait aerial extends MapTypeId
  
  /** High resolution aerial imagery taken at 45 degrees to the ground, from 4 different directions. */
  @js.native
  sealed trait birdseye extends MapTypeId
  
  /** A darker version of the road maps. */
  @js.native
  sealed trait canvasDark extends MapTypeId
  
  /** A lighter version of the road maps which also has some of the details such as hill shading disabled. */
  @js.native
  sealed trait canvasLight extends MapTypeId
  
  /** A grayscale version of the road maps. */
  @js.native
  sealed trait grayscale extends MapTypeId
  
  /** Displays a blank canvas that uses the mercator map project. It basically removed the base maps layer. */
  @js.native
  sealed trait mercator extends MapTypeId
  
  /** Ordnance survey map type (en-gb only). */
  @js.native
  sealed trait ordnanceSurvey extends MapTypeId
  
  /** Road map type. */
  @js.native
  sealed trait road extends MapTypeId
  
  /** Provides streetside panoramas from the street level. */
  @js.native
  sealed trait streetside extends MapTypeId
}
