package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.IsStopIncluded
import typingsSlinky.cesium.mod.TimeInterval.DataComparer
import typingsSlinky.cesium.mod.TimeInterval.MergeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TimeIntervalCollection")
@js.native
class TimeIntervalCollection () extends StObject {
  def this(intervals: js.Array[TimeInterval]) = this()
  
  def addInterval(interval: TimeInterval): Unit = js.native
  def addInterval(interval: TimeInterval, dataComparer: DataComparer): Unit = js.native
  
  val changedEvent: Event[js.Array[TimeIntervalCollection]] = js.native
  
  def contains(julianDate: JulianDate): Boolean = js.native
  
  def equals(): Boolean = js.native
  def equals(right: js.UndefOr[scala.Nothing], dataComparer: DataComparer): Boolean = js.native
  def equals(right: TimeIntervalCollection): Boolean = js.native
  def equals(right: TimeIntervalCollection, dataComparer: DataComparer): Boolean = js.native
  
  def findDataForIntervalContainingDate(date: JulianDate): js.Any = js.native
  
  def findInterval(): TimeInterval = js.native
  def findInterval(options: IsStopIncluded): TimeInterval = js.native
  
  def findIntervalContainingDate(date: JulianDate): js.UndefOr[TimeInterval] = js.native
  
  def get(index: Double): TimeInterval = js.native
  
  def indexOf(date: JulianDate): Double = js.native
  
  def intersect(other: TimeIntervalCollection): TimeIntervalCollection = js.native
  def intersect(
    other: TimeIntervalCollection,
    dataComparer: js.UndefOr[scala.Nothing],
    mergeCallback: MergeCallback
  ): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: DataComparer): TimeIntervalCollection = js.native
  def intersect(other: TimeIntervalCollection, dataComparer: DataComparer, mergeCallback: MergeCallback): TimeIntervalCollection = js.native
  
  val isEmpty: Boolean = js.native
  
  val isStartIncluded: Boolean = js.native
  
  val isStopIncluded: Boolean = js.native
  
  val length: Double = js.native
  
  def removeAll(): Unit = js.native
  
  def removeInterval(interval: TimeInterval): Unit = js.native
  
  val start: JulianDate = js.native
  
  val stop: JulianDate = js.native
}
