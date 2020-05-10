package typingsSlinky.sccBrokerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingEngine extends js.Object {
  def findSite(key: String): String = js.native
  def getSites(): js.Array[String] = js.native
  def setSites(sites: js.Array[String]): Unit = js.native
}

object MappingEngine {
  @scala.inline
  def apply(findSite: String => String, getSites: () => js.Array[String], setSites: js.Array[String] => Unit): MappingEngine = {
    val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
    __obj.asInstanceOf[MappingEngine]
  }
  @scala.inline
  implicit class MappingEngineOps[Self <: MappingEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindSite(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findSite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSites(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSites")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSites(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSites")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

