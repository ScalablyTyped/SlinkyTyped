package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.mod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonItemSliding extends StObject {
  
  /**
    * Close the sliding item. Items can also be closed from the [List](../list).
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Close all of the sliding items in the list. Items can also be closed from the [List](../list).
    */
  def closeOpened(): js.Promise[Boolean] = js.native
  
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: Boolean = js.native
  
  /**
    * Get the amount the item is open in pixels.
    */
  def getOpenAmount(): js.Promise[Double] = js.native
  
  /**
    * Get the ratio of the open amount of the item compared to the width of the options. If the number returned is positive, then the options on the right side are open. If the number returned is negative, then the options on the left side are open. If the absolute value of the number is greater than 1, the item is open more than the width of the options.
    */
  def getSlidingRatio(): js.Promise[Double] = js.native
  
  /**
    * Open the sliding item.
    * @param side The side of the options to open. If a side is not provided, it will open the first set of options it finds within the item.
    */
  def open(): js.Promise[Unit] = js.native
  def open(side: Side): js.Promise[Unit] = js.native
}
