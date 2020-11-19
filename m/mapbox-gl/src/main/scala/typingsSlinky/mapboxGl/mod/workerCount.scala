package typingsSlinky.mapboxGl.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Number of web workers instantiated on a page with GL JS maps.
  * By default, it is set to half the number of CPU cores (capped at 6).
  */
@JSImport("mapbox-gl", "workerCount")
@js.native
object workerCount extends TopLevel[Double]
