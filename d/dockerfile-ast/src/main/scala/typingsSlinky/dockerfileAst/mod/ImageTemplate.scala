package typingsSlinky.dockerfileAst.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageTemplate extends js.Object {
  def contains(position: Position): Boolean
  def getARGs(): js.Array[typingsSlinky.dockerfileAst.argMod.Arg]
  /**
    * Retrieves an array of variable names that are valid at the
    * given line in the Dockerfile (zero-based). If the
    * line is outside the range of the parsed Dockerfile, an empty
    * array will be returned.
    *
    * @param line the interested line, zero-based
    * @return the array of variables that may be used by an
    *         instruction at the specified line
    */
  def getAvailableVariables(line: Double): js.Array[String]
  def getCMDs(): js.Array[typingsSlinky.dockerfileAst.cmdMod.Cmd]
  def getCOPYs(): js.Array[typingsSlinky.dockerfileAst.copyMod.Copy]
  def getComments(): js.Array[typingsSlinky.dockerfileAst.commentMod.Comment]
  def getENTRYPOINTs(): js.Array[typingsSlinky.dockerfileAst.entrypointMod.Entrypoint]
  def getENVs(): js.Array[typingsSlinky.dockerfileAst.envMod.Env]
  def getFROMs(): js.Array[typingsSlinky.dockerfileAst.fromMod.From]
  def getHEALTHCHECKs(): js.Array[typingsSlinky.dockerfileAst.healthcheckMod.Healthcheck]
  def getInstructions(): js.Array[typingsSlinky.dockerfileAst.instructionMod.Instruction]
  def getOnbuildTriggers(): js.Array[typingsSlinky.dockerfileAst.instructionMod.Instruction]
  def getRange(): Range | Null
}

object ImageTemplate {
  @scala.inline
  def apply(
    contains: Position => Boolean,
    getARGs: () => js.Array[typingsSlinky.dockerfileAst.argMod.Arg],
    getAvailableVariables: Double => js.Array[String],
    getCMDs: () => js.Array[typingsSlinky.dockerfileAst.cmdMod.Cmd],
    getCOPYs: () => js.Array[typingsSlinky.dockerfileAst.copyMod.Copy],
    getComments: () => js.Array[typingsSlinky.dockerfileAst.commentMod.Comment],
    getENTRYPOINTs: () => js.Array[typingsSlinky.dockerfileAst.entrypointMod.Entrypoint],
    getENVs: () => js.Array[typingsSlinky.dockerfileAst.envMod.Env],
    getFROMs: () => js.Array[typingsSlinky.dockerfileAst.fromMod.From],
    getHEALTHCHECKs: () => js.Array[typingsSlinky.dockerfileAst.healthcheckMod.Healthcheck],
    getInstructions: () => js.Array[typingsSlinky.dockerfileAst.instructionMod.Instruction],
    getOnbuildTriggers: () => js.Array[typingsSlinky.dockerfileAst.instructionMod.Instruction],
    getRange: () => Range | Null
  ): ImageTemplate = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getARGs = js.Any.fromFunction0(getARGs), getAvailableVariables = js.Any.fromFunction1(getAvailableVariables), getCMDs = js.Any.fromFunction0(getCMDs), getCOPYs = js.Any.fromFunction0(getCOPYs), getComments = js.Any.fromFunction0(getComments), getENTRYPOINTs = js.Any.fromFunction0(getENTRYPOINTs), getENVs = js.Any.fromFunction0(getENVs), getFROMs = js.Any.fromFunction0(getFROMs), getHEALTHCHECKs = js.Any.fromFunction0(getHEALTHCHECKs), getInstructions = js.Any.fromFunction0(getInstructions), getOnbuildTriggers = js.Any.fromFunction0(getOnbuildTriggers), getRange = js.Any.fromFunction0(getRange))
    __obj.asInstanceOf[ImageTemplate]
  }
}

