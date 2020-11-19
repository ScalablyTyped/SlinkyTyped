package typingsSlinky.nodegit.submoduleMod

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/submodule", "Submodule")
@js.native
class Submodule_ () extends js.Object {
  
  def addFinalize(): js.Promise[Double] = js.native
  
  def addToIndex(writeIndex: Double): js.Promise[Double] = js.native
  
  def branch(): String = js.native
  
  def fetchRecurseSubmodules(): Double = js.native
  
  def free(): Unit = js.native
  
  def headId(): Oid = js.native
  
  def ignore(): Double = js.native
  
  def indexId(): Oid = js.native
  
  def init(overwrite: Double): js.Promise[Double] = js.native
  
  def location(): js.Promise[Double] = js.native
  
  def name(): String = js.native
  
  def open(): js.Promise[Repository] = js.native
  
  def owner(): Repository = js.native
  
  def path(): String = js.native
  
  def reload(force: Double): Double = js.native
  
  def repoInit(useGitLink: Double): js.Promise[Repository] = js.native
  
  def sync(): js.Promise[Double] = js.native
  
  /**
    * Updates a submodule
    *
    *
    */
  def update(init: Double): js.Promise[Double] = js.native
  def update(init: Double, options: SubmoduleUpdateOptions): js.Promise[Double] = js.native
  
  def updateStrategy(): Double = js.native
  
  def url(): String = js.native
  
  def wdId(): Oid = js.native
}
