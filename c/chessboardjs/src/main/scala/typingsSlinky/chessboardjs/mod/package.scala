package typingsSlinky.chessboardjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoardPositionType = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in chessboardjs.chessboardjs.Square ]:? chessboardjs.chessboardjs.Piece}
    */ typingsSlinky.chessboardjs.chessboardjsStrings.BoardPositionType with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Callback = js.Function0[scala.Unit]
  
  @scala.inline
  def ChessBoard: typingsSlinky.chessboardjs.mod.ChessBoardFactory = typingsSlinky.chessboardjs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ChessBoard").asInstanceOf[typingsSlinky.chessboardjs.mod.ChessBoardFactory]
  
  type OrientationFlipType = typingsSlinky.chessboardjs.chessboardjsStrings.flip
  
  type PositionFenType = typingsSlinky.chessboardjs.chessboardjsStrings.fen
  
  type PositionType = typingsSlinky.chessboardjs.chessboardjsStrings.start | java.lang.String | typingsSlinky.chessboardjs.mod.BoardPositionType
}
