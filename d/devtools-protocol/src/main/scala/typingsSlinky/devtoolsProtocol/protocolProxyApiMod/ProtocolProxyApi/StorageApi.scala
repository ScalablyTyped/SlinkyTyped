package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageContentUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageListUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.indexedDBContentUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.indexedDBListUpdated
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.CacheStorageContentUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.CacheStorageListUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.ClearCookiesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.ClearDataForOriginRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.GetCookiesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.GetCookiesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.IndexedDBContentUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.IndexedDBListUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.SetCookiesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForOriginRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForOriginRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForOriginRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForOriginRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageApi extends js.Object {
  /**
    * Clears cookies.
    */
  def clearCookies(params: ClearCookiesRequest): js.Promise[Unit] = js.native
  /**
    * Clears storage for origin.
    */
  def clearDataForOrigin(params: ClearDataForOriginRequest): js.Promise[Unit] = js.native
  /**
    * Returns all browser cookies.
    */
  def getCookies(params: GetCookiesRequest): js.Promise[GetCookiesResponse] = js.native
  /**
    * Returns usage and quota in bytes.
    */
  def getUsageAndQuota(params: GetUsageAndQuotaRequest): js.Promise[GetUsageAndQuotaResponse] = js.native
  /**
    * A cache's contents have been modified.
    */
  @JSName("on")
  def on_cacheStorageContentUpdated(
    event: cacheStorageContentUpdated,
    listener: js.Function1[/* params */ CacheStorageContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * A cache has been added/deleted.
    */
  @JSName("on")
  def on_cacheStorageListUpdated(
    event: cacheStorageListUpdated,
    listener: js.Function1[/* params */ CacheStorageListUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB object store has been modified.
    */
  @JSName("on")
  def on_indexedDBContentUpdated(
    event: indexedDBContentUpdated,
    listener: js.Function1[/* params */ IndexedDBContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB database list has been modified.
    */
  @JSName("on")
  def on_indexedDBListUpdated(event: indexedDBListUpdated, listener: js.Function1[/* params */ IndexedDBListUpdatedEvent, Unit]): Unit = js.native
  /**
    * Sets given cookies.
    */
  def setCookies(params: SetCookiesRequest): js.Promise[Unit] = js.native
  /**
    * Registers origin to be notified when an update occurs to its cache storage list.
    */
  def trackCacheStorageForOrigin(params: TrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  /**
    * Registers origin to be notified when an update occurs to its IndexedDB.
    */
  def trackIndexedDBForOrigin(params: TrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
  /**
    * Unregisters origin from receiving notifications for cache storage.
    */
  def untrackCacheStorageForOrigin(params: UntrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  /**
    * Unregisters origin from receiving notifications for IndexedDB.
    */
  def untrackIndexedDBForOrigin(params: UntrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
}

