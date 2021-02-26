package typingsSlinky.chessboardjs

import typingsSlinky.chessboardjs.mod.DropOffBoardType
import typingsSlinky.chessboardjs.mod.OrientationType
import typingsSlinky.chessboardjs.mod.SpeedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chessboardjsStrings {
  
  @js.native
  sealed trait BoardPositionType extends StObject
  @scala.inline
  def BoardPositionType: BoardPositionType = "BoardPositionType".asInstanceOf[BoardPositionType]
  
  @js.native
  sealed trait black extends OrientationType
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait fast extends SpeedType
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait fen extends StObject
  @scala.inline
  def fen: fen = "fen".asInstanceOf[fen]
  
  @js.native
  sealed trait flip extends StObject
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait slow extends SpeedType
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  
  @js.native
  sealed trait snapback extends DropOffBoardType
  @scala.inline
  def snapback: snapback = "snapback".asInstanceOf[snapback]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait trash extends DropOffBoardType
  @scala.inline
  def trash: trash = "trash".asInstanceOf[trash]
  
  @js.native
  sealed trait white extends OrientationType
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}
