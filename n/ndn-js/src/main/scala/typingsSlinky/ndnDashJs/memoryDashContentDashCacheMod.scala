package typingsSlinky.ndnDashJs

import typingsSlinky.ndnDashJs.dataMod.Data
import typingsSlinky.ndnDashJs.faceMod.Face
import typingsSlinky.ndnDashJs.faceMod.ForwardingFlags
import typingsSlinky.ndnDashJs.faceMod.InterestFilter
import typingsSlinky.ndnDashJs.faceMod.OnInterestCallback
import typingsSlinky.ndnDashJs.interestMod.Interest
import typingsSlinky.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/memory-content-cache", JSImport.Namespace)
@js.native
object memoryDashContentDashCacheMod extends js.Object {
  @js.native
  class MemoryContentCache protected () extends js.Object {
    def this(face: Face) = this()
    def this(face: Face, cleanupIntervalMilliseconds: Double) = this()
    def add(data: Data): Unit = js.native
    def getMinimumCacheLifetime(): Double = js.native
    def getStorePendingInterest(): OnInterestCallback = js.native
    def registerPrefix(name: Name, onRegisterFailed: js.Function1[/* prefix */ Name, _]): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _]
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback,
      flags: ForwardingFlags
    ): Unit = js.native
    def setInterestFilter(filter: InterestFilter): Unit = js.native
    def setInterestFilter(filter: InterestFilter, onDataNotFound: OnInterestCallback): Unit = js.native
    def setInterestFilter(filter: Name): Unit = js.native
    def setInterestFilter(filter: Name, onDataNotFound: OnInterestCallback): Unit = js.native
    def setMinimumCacheLifetime(minimumCacheLifetime: Double): Unit = js.native
    def storePendingInterest(interest: Interest, face: Face): Unit = js.native
    def unregisterAll(): Unit = js.native
  }
  
}

