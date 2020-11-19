package typingsSlinky.conventionalRecommendedBump

import typingsSlinky.conventionalRecommendedBump.mod.Callback.Recommendation.ReleaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conventionalRecommendedBumpStrings {
  
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait major extends ReleaseType
  
  @js.native
  sealed trait minor extends ReleaseType
  
  @js.native
  sealed trait patch extends ReleaseType
}
