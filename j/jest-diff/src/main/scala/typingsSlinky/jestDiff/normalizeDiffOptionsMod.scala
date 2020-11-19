package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.typesMod.DiffOptions
import typingsSlinky.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-diff/build/normalizeDiffOptions", JSImport.Namespace)
@js.native
object normalizeDiffOptionsMod extends js.Object {
  
  def noColor(string: String): String = js.native
  
  def normalizeDiffOptions(): DiffOptionsNormalized = js.native
  def normalizeDiffOptions(options: DiffOptions): DiffOptionsNormalized = js.native
}
