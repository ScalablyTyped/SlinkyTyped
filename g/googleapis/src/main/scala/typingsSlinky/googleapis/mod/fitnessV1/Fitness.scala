package typingsSlinky.googleapis.mod.fitnessV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fitness
  *
  * Stores and accesses user data in the fitness store from apps on any
  * platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const fitness = google.fitness('v1');
  *
  * @namespace fitness
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Fitness
  */
@JSImport("googleapis", "fitness_v1.Fitness")
@js.native
class Fitness protected ()
  extends typingsSlinky.googleapis.fitnessV1Mod.fitnessV1.Fitness {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
