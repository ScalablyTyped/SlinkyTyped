package typingsSlinky.gitBranchIs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Expected name of current branch
  * or a test function to apply to the branch name
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.gitBranchIs.mod.BranchNameTest
*/
trait BranchNameOrTest extends js.Object

object BranchNameOrTest {
  @scala.inline
  implicit def apply(value: BranchNameTest): BranchNameOrTest = value.asInstanceOf[BranchNameOrTest]
  @scala.inline
  implicit def apply(value: String): BranchNameOrTest = value.asInstanceOf[BranchNameOrTest]
}

