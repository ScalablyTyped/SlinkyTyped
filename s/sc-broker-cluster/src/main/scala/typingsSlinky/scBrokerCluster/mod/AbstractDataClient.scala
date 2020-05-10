package typingsSlinky.scBrokerCluster.mod

import typingsSlinky.expirymanager.mod.Keys
import typingsSlinky.fleximap.mod.FlexiMap
import typingsSlinky.fleximap.mod.KeyChain
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBroker.mod.QueryOptions
import typingsSlinky.scBroker.mod.SpliceOptions
import typingsSlinky.scBrokerCluster.clientclusterMod.ClientCluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "AbstractDataClient")
@js.native
class AbstractDataClient protected () extends EventEmitter {
  def this(dataClient: ClientCluster) = this()
  def add(keyChain: KeyChain, value: js.Any): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def add(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def count(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  def exec(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def exec(query: js.Function1[/* datamap */ FlexiMap, Unit], options: QueryOptions): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    options: QueryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def expire(keys: Keys, seconds: Double): Unit = js.native
  def expire(keys: Keys, seconds: Double, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def extractKeys(keyChain: KeyChain): js.Array[String] = js.native
  def extractValues(keyChain: KeyChain): js.Array[_] = js.native
  def get(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit]): Unit = js.native
  def getAll(callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[_] | js.Object, Unit]): Unit = js.native
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  def hasKey(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* data */ Boolean, Unit]): Unit = js.native
  def pop(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit]): Unit = js.native
  def remove(keyChain: KeyChain): Unit = js.native
  def remove(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def remove(keyChain: KeyChain, getValue: Boolean): Unit = js.native
  def remove(
    keyChain: KeyChain,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double, getValue: Boolean): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def set(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def splice(keyChain: KeyChain): Unit = js.native
  def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def splice(keyChain: KeyChain, options: SpliceOptions): Unit = js.native
  def splice(
    keyChain: KeyChain,
    options: SpliceOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def unexpire(keys: Keys): Unit = js.native
  def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

