package typingsSlinky.chessJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chessJs.anon.BIGPAWN
import typingsSlinky.chessJs.anon.Color
import typingsSlinky.chessJs.anon.Error
import typingsSlinky.chessJs.anon.Maxwidth
import typingsSlinky.chessJs.anon.Newlinechar
import typingsSlinky.chessJs.anon.Sloppy
import typingsSlinky.chessJs.anon.SquareVerbose
import typingsSlinky.chessJs.anon.Verbose
import typingsSlinky.chessJs.anon.`0`
import typingsSlinky.chessJs.anon.`1`
import typingsSlinky.chessJs.anon.`2`
import typingsSlinky.chessJs.chessJsStrings.b
import typingsSlinky.chessJs.chessJsStrings.dark
import typingsSlinky.chessJs.chessJsStrings.k
import typingsSlinky.chessJs.chessJsStrings.light
import typingsSlinky.chessJs.chessJsStrings.n
import typingsSlinky.chessJs.chessJsStrings.p
import typingsSlinky.chessJs.chessJsStrings.q
import typingsSlinky.chessJs.chessJsStrings.r
import typingsSlinky.chessJs.chessJsStrings.w
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chess.js", "Chess")
  @js.native
  /**
    * The Chess() constructor takes an optional parameter which specifies
    * the board configuration in Forsyth-Edwards Notation.
    * @param fen specifies the board configuration in Forsyth-Edwards Notation.
    */
  class Chess () extends ChessInstance {
    def this(fen: String) = this()
  }
  /**
    * The Chess() constructor takes an optional parameter which specifies
    * the board configuration in Forsyth-Edwards Notation.
    * @param fen specifies the board configuration in Forsyth-Edwards Notation.
    */
  @JSImport("chess.js", "Chess")
  @js.native
  def Chess(): ChessInstance = js.native
  @JSImport("chess.js", "Chess")
  @js.native
  def Chess(fen: String): ChessInstance = js.native
  
  @js.native
  trait ChessInstance extends StObject {
    
    /** The string that represents a Bishop */
    val BISHOP: b = js.native
    
    /** The string that represents the Black color side */
    val BLACK: b = js.native
    
    /** Flags used to build flag strings for moves */
    val FLAGS: BIGPAWN = js.native
    
    /** The string that represents a King */
    val KING: k = js.native
    
    /** The string that represents a Knight */
    val KNIGHT: n = js.native
    
    /** The string that represents a Pawn */
    val PAWN: p = js.native
    
    /** The string that represents a Queen */
    val QUEEN: q = js.native
    
    /** The string that represents a Rook */
    val ROOK: r = js.native
    
    /** A list of all the squares in the game, from "a1" to "h8" */
    val SQUARES: js.Array[js.Any] = js.native
    
    /** The string that represents the White color side */
    val WHITE: w = js.native
    
    /**
      * Returns a string containing an ASCII diagram of the current position.
      * @returns A string containing an ASCII diagram of the current position.
      */
    def ascii(): String = js.native
    
    def board(): js.Array[js.Array[Color | Null]] = js.native
    
    /**
      * Clears the board of all pieces.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns the FEN string for the current position.
      * @returns the FEN string for the current position.
      */
    def fen(): String = js.native
    
    /**
      * Returns true if the game has ended via checkmate, stalemate, draw,
      * threefold repetition, or insufficient material.
      * Otherwise, returns false.
      * @returns True if the game has ended via checkmate, stalemate, draw,
      * threefold repetition, or insufficient material. Otherwise, returns
      * false.
      */
    def game_over(): Boolean = js.native
    
    /**
      * Returns the piece on the square
      * @param square the square to get the piece on.
      * @returns null if no piece is on that square, or it is not a valid
      * square. Otherwise a piece object.
      */
    def get(square: Square): Piece | Null = js.native
    
    /**
      * Allows header information to be added to PGN output.
      * Any number of key/value pairs can be passed to .header(), with each
      * first arg being treated as a header key, and each second as the value.
      * @param args (optional) Header pairs to store in the header.
      * @returns The current header information after storing any values.
      */
    def header(args: String*): StringDictionary[js.UndefOr[String]] = js.native
    
    /**
      * Returns a list containing the moves of the current game.
      * Options is an optional parameter which may contain a 'verbose' flag.
      * See .moves() for a description of the verbose move fields.
      * @param options an optional parameter which may contain a 'verbose' flag.
      * @returns a list of all moves of the current game. They will be strings
      * if not passed the verbose flag.
      */
    def history(): js.Array[String] = js.native
    def history(options: `0`): js.Array[String] = js.native
    /**
      * Returns a list containing the moves of the current game.
      * Options is an optional parameter which may contain a 'verbose' flag.
      * See .moves() for a description of the verbose move fields.
      * @param options an optional parameter which may contain a 'verbose' flag.
      * @returns a list of all moves of the current game. They will be strings
      * if not passed the verbose flag.
      */
    def history(options: `1`): js.Array[Move] = js.native
    def history(options: `2`): js.Array[Move | String] = js.native
    
    /**
      * Returns true or false if the side to move is in check.
      * @returns true or false if the side to move is in check.
      */
    def in_check(): Boolean = js.native
    
    /**
      * Returns true or false if the side to move has been checkmated.
      * @returns true or false if the side to move has been checkmated.
      */
    def in_checkmate(): Boolean = js.native
    
    /**
      * Returns true or false if the game is drawn (50-move rule or
      * insufficient material).
      * @returns true or false if the game is drawn (50-move rule or
      * insufficient material).
      */
    def in_draw(): Boolean = js.native
    
    /**
      * Returns true or false if the side to move has been stalemated.
      * @returns true or false if the side to move has been stalemated.
      */
    def in_stalemate(): Boolean = js.native
    
    /**
      * Returns true or false if the current board position has occurred three
      * or more times.
      * @returns true or false if the current board position has occurred three
      * or more times.
      */
    def in_threefold_repetition(): Boolean = js.native
    
    /**
      * Returns true if the game is drawn due to insufficient material
      * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
      * @returns True if the game is drawn due to insufficient material
      * (K vs. K, K vs. KB, or K vs. KN); otherwise false.
      */
    def insufficient_material(): Boolean = js.native
    
    /**
      * The board is cleared, and the FEN string is loaded.
      * Returns true if the position was successfully loaded, otherwise false
      * @param fen the fen formatted string to load
      * @returns true if the position was successfully loaded, otherwise
      * false
      */
    def load(fen: String): Boolean = js.native
    
    /**
      * Load the moves of a game stored in Portable Game Notation.
      * @param pgn the pgn should be a string in Portable Game Notation.
      * @param options An optional object which may contain a string
      * newline_char and a boolean sloppy.
      * @returns The method will return true if the PGN was parsed successfully,
      * otherwise false.
      */
    def load_pgn(pgn: String): Boolean = js.native
    def load_pgn(pgn: String, options: Newlinechar): Boolean = js.native
    
    /**
      * Attempts to make a move on the board, returning a move object if the
      * move was legal, otherwise null.
      * The .move function can be called two ways, by passing a string in
      * Standard Algebraic Notation (SAN),
      * Or by passing .move() a move object (only the 'to', 'from', and when
      * necessary 'promotion', fields are needed).
      * @param move Must be either a string in Standard Algebraic Notation
      * (SAN), or a move object (only the 'to', 'from', and when necessary
      * 'promotion', fields are needed)
      * @param options An optional sloppy flag can be used to parse a variety of
      * non-standard move notations:
      * @returns The move as a full object is returned if the move was valid,
      * and the chess board's state changes.
      * If the move was invalid, null is returned and the state does not update.
      */
    def move(move: String): Move | Null = js.native
    def move(move: String, options: Sloppy): Move | Null = js.native
    def move(move: ShortMove): Move | Null = js.native
    def move(move: ShortMove, options: Sloppy): Move | Null = js.native
    
    /**
      * Returns a list of legal moves from the current position.
      * The function takes an optional parameter which controls the
      * single-square move generation and verbosity.
      * @param options an optional parameter which controls the single-square
      * move generation and verbosity.
      * @returns The list of all valid moves, either in SAN format, or as
      * verbose objects.
      */
    def moves(): js.Array[String] = js.native
    /**
      * Returns a list of legal moves from the current position.
      * The function takes an optional parameter which controls the
      * single-square move generation and verbosity.
      * @param options an optional parameter which controls the single-square
      * move generation and verbosity.
      * @returns The list of all valid moves, either in SAN format, or as
      * verbose objects.
      */
    def moves(options: typingsSlinky.chessJs.anon.Square): js.Array[Move] = js.native
    def moves(options: SquareVerbose): js.Array[Move | String] = js.native
    def moves(options: Verbose): js.Array[String] = js.native
    
    /**
      * Returns the game in PGN format.
      * Options is an optional parameter which may include max width and/or a
      * newline character settings.
      * @param options optional object which may include max width and/or a
      * newline character settings.
      * @returns the current game state in PGN format.
      */
    def pgn(): String = js.native
    def pgn(options: Maxwidth): String = js.native
    
    /**
      * Place a piece on the square where piece is an object with the form
      * { type: ..., color: ... }.
      * put() will fail when passed an invalid piece or square, or when two
      * or more kings of the same color are placed.
      * @param piece the piece to put somewhere on the game board.
      * @param square the square on the chess board to place the piece at.
      * @returns true if the piece was successfully placed, otherwise, the
      * board remains unchanged and false is returned.
      */
    def put(piece: Piece, square: Square): Boolean = js.native
    
    /**
      * Remove and return the piece on square.
      * @param square the square to remove the piece from, e.g. "b6"
      * @returns null if no piece was removed, otherwise an object with the
      * removed piece's type and color.
      */
    def remove(square: Square): Piece | Null = js.native
    
    /**
      * Reset the board to the initial starting position.
      */
    def reset(): Unit = js.native
    
    /**
      * Returns the color of the square ('light' or 'dark').
      * @param square the square to check if it is light or dark.
      * @returns "light" if a light square, "dark" if a dark square, or null if
      * not a valid square.
      */
    def square_color(square: String): light | dark | Null = js.native
    // This is a debugging utility, and is not documented in their readme.
    // So it is not included in these type definitions.
    // perft(depth: number): number,
    /**
      * Returns the color of the square ('light' or 'dark').
      * @param square the square to check if it is light or dark.
      * @returns "light" if a light square, "dark" if a dark square, or null if
      * not a valid square.
      */
    def square_color(square: Square): light | dark = js.native
    
    /**
      * Returns the current side to move.
      * @returns "b" if Black is the side to move, otherwise "w" for White.
      */
    def turn(): b | w = js.native
    
    /**
      * Take back the last half-move, returning a move object if successful,
      * otherwise null.
      * @returns the move object that was undone if successful, otherwise null.
      */
    def undo(): Move | Null = js.native
    
    /**
      * Returns a validation object specifying validity or the errors found
      * within the FEN string.
      * @param fen the fen formatted string to validate
      */
    def validate_fen(fen: String): Error = js.native
  }
  
  @js.native
  trait Move extends ShortMove {
    
    /**
      * If an enemy piece was captured this is their type
      */
    var captured: js.UndefOr[Exclude[PieceType, k]] = js.native
    
    /**
      * The color of the piece that moved
      * - "b" for Black
      * - "w" for White
      */
    var color: b | w = js.native
    
    /** Flags indicating what occurred, combined into one string */
    var flags: String = js.native
    
    /**
      * The type of the piece that moved
      */
    var piece: PieceType = js.native
    
    /** The Standard Algebraic Notation (SAN) representation of the move */
    var san: String = js.native
  }
  object Move {
    
    @scala.inline
    def apply(color: b | w, flags: String, from: Square, piece: PieceType, san: String, to: Square): Move = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move]
    }
    
    @scala.inline
    implicit class MoveMutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptured(value: Exclude[PieceType, k]): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapturedUndefined: Self = StObject.set(x, "captured", js.undefined)
      
      @scala.inline
      def setColor(value: b | w): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPiece(value: PieceType): Self = StObject.set(x, "piece", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSan(value: String): Self = StObject.set(x, "san", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Piece extends StObject {
    
    /**
      * The color of the piece
      * - "b" for Black
      * - "w" for White
      */
    var color: b | w = js.native
    
    /**
      * The type of the piece to place
      */
    var `type`: PieceType = js.native
  }
  object Piece {
    
    @scala.inline
    def apply(color: b | w, `type`: PieceType): Piece = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Piece]
    }
    
    @scala.inline
    implicit class PieceMutableBuilder[Self <: Piece] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: b | w): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PieceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chessJs.chessJsStrings.p
    - typingsSlinky.chessJs.chessJsStrings.n
    - typingsSlinky.chessJs.chessJsStrings.b
    - typingsSlinky.chessJs.chessJsStrings.r
    - typingsSlinky.chessJs.chessJsStrings.q
    - typingsSlinky.chessJs.chessJsStrings.k
  */
  trait PieceType extends StObject
  object PieceType {
    
    @scala.inline
    def b: typingsSlinky.chessJs.chessJsStrings.b = "b".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b]
    
    @scala.inline
    def k: typingsSlinky.chessJs.chessJsStrings.k = "k".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.k]
    
    @scala.inline
    def n: typingsSlinky.chessJs.chessJsStrings.n = "n".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.n]
    
    @scala.inline
    def p: typingsSlinky.chessJs.chessJsStrings.p = "p".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.p]
    
    @scala.inline
    def q: typingsSlinky.chessJs.chessJsStrings.q = "q".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.q]
    
    @scala.inline
    def r: typingsSlinky.chessJs.chessJsStrings.r = "r".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.r]
  }
  
  @js.native
  trait ShortMove extends StObject {
    
    /**
      * The location the piece is moving from.
      * Must be in san format, e.g "h8"
      */
    var from: Square = js.native
    
    /**
      * If this move results in a promotion, this will have the unit promotion.
      */
    var promotion: js.UndefOr[Exclude[PieceType, p]] = js.native
    
    /**
      * The location the piece is moving to.
      * Must be in san format, e.g "a1"
      */
    var to: Square = js.native
  }
  object ShortMove {
    
    @scala.inline
    def apply(from: Square, to: Square): ShortMove = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortMove]
    }
    
    @scala.inline
    implicit class ShortMoveMutableBuilder[Self <: ShortMove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Square): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotion(value: Exclude[PieceType, p]): Self = StObject.set(x, "promotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionUndefined: Self = StObject.set(x, "promotion", js.undefined)
      
      @scala.inline
      def setTo(value: Square): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chessJs.chessJsStrings.a8
    - typingsSlinky.chessJs.chessJsStrings.b8
    - typingsSlinky.chessJs.chessJsStrings.c8
    - typingsSlinky.chessJs.chessJsStrings.d8
    - typingsSlinky.chessJs.chessJsStrings.e8
    - typingsSlinky.chessJs.chessJsStrings.f8
    - typingsSlinky.chessJs.chessJsStrings.g8
    - typingsSlinky.chessJs.chessJsStrings.h8
    - typingsSlinky.chessJs.chessJsStrings.a7
    - typingsSlinky.chessJs.chessJsStrings.b7
    - typingsSlinky.chessJs.chessJsStrings.c7
    - typingsSlinky.chessJs.chessJsStrings.d7
    - typingsSlinky.chessJs.chessJsStrings.e7
    - typingsSlinky.chessJs.chessJsStrings.f7
    - typingsSlinky.chessJs.chessJsStrings.g7
    - typingsSlinky.chessJs.chessJsStrings.h7
    - typingsSlinky.chessJs.chessJsStrings.a6
    - typingsSlinky.chessJs.chessJsStrings.b6
    - typingsSlinky.chessJs.chessJsStrings.c6
    - typingsSlinky.chessJs.chessJsStrings.d6
    - typingsSlinky.chessJs.chessJsStrings.e6
    - typingsSlinky.chessJs.chessJsStrings.f6
    - typingsSlinky.chessJs.chessJsStrings.g6
    - typingsSlinky.chessJs.chessJsStrings.h6
    - typingsSlinky.chessJs.chessJsStrings.a5
    - typingsSlinky.chessJs.chessJsStrings.b5
    - typingsSlinky.chessJs.chessJsStrings.c5
    - typingsSlinky.chessJs.chessJsStrings.d5
    - typingsSlinky.chessJs.chessJsStrings.e5
    - typingsSlinky.chessJs.chessJsStrings.f5
    - typingsSlinky.chessJs.chessJsStrings.g5
    - typingsSlinky.chessJs.chessJsStrings.h5
    - typingsSlinky.chessJs.chessJsStrings.a4
    - typingsSlinky.chessJs.chessJsStrings.b4
    - typingsSlinky.chessJs.chessJsStrings.c4
    - typingsSlinky.chessJs.chessJsStrings.d4
    - typingsSlinky.chessJs.chessJsStrings.e4
    - typingsSlinky.chessJs.chessJsStrings.f4
    - typingsSlinky.chessJs.chessJsStrings.g4
    - typingsSlinky.chessJs.chessJsStrings.h4
    - typingsSlinky.chessJs.chessJsStrings.a3
    - typingsSlinky.chessJs.chessJsStrings.b3
    - typingsSlinky.chessJs.chessJsStrings.c3
    - typingsSlinky.chessJs.chessJsStrings.d3
    - typingsSlinky.chessJs.chessJsStrings.e3
    - typingsSlinky.chessJs.chessJsStrings.f3
    - typingsSlinky.chessJs.chessJsStrings.g3
    - typingsSlinky.chessJs.chessJsStrings.h3
    - typingsSlinky.chessJs.chessJsStrings.a2
    - typingsSlinky.chessJs.chessJsStrings.b2
    - typingsSlinky.chessJs.chessJsStrings.c2
    - typingsSlinky.chessJs.chessJsStrings.d2
    - typingsSlinky.chessJs.chessJsStrings.e2
    - typingsSlinky.chessJs.chessJsStrings.f2
    - typingsSlinky.chessJs.chessJsStrings.g2
    - typingsSlinky.chessJs.chessJsStrings.h2
    - typingsSlinky.chessJs.chessJsStrings.a1
    - typingsSlinky.chessJs.chessJsStrings.b1
    - typingsSlinky.chessJs.chessJsStrings.c1
    - typingsSlinky.chessJs.chessJsStrings.d1
    - typingsSlinky.chessJs.chessJsStrings.e1
    - typingsSlinky.chessJs.chessJsStrings.f1
    - typingsSlinky.chessJs.chessJsStrings.g1
    - typingsSlinky.chessJs.chessJsStrings.h1
  */
  trait Square extends StObject
  object Square {
    
    @scala.inline
    def a1: typingsSlinky.chessJs.chessJsStrings.a1 = "a1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a1]
    
    @scala.inline
    def a2: typingsSlinky.chessJs.chessJsStrings.a2 = "a2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a2]
    
    @scala.inline
    def a3: typingsSlinky.chessJs.chessJsStrings.a3 = "a3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a3]
    
    @scala.inline
    def a4: typingsSlinky.chessJs.chessJsStrings.a4 = "a4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a4]
    
    @scala.inline
    def a5: typingsSlinky.chessJs.chessJsStrings.a5 = "a5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a5]
    
    @scala.inline
    def a6: typingsSlinky.chessJs.chessJsStrings.a6 = "a6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a6]
    
    @scala.inline
    def a7: typingsSlinky.chessJs.chessJsStrings.a7 = "a7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a7]
    
    @scala.inline
    def a8: typingsSlinky.chessJs.chessJsStrings.a8 = "a8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.a8]
    
    @scala.inline
    def b1: typingsSlinky.chessJs.chessJsStrings.b1 = "b1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b1]
    
    @scala.inline
    def b2: typingsSlinky.chessJs.chessJsStrings.b2 = "b2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b2]
    
    @scala.inline
    def b3: typingsSlinky.chessJs.chessJsStrings.b3 = "b3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b3]
    
    @scala.inline
    def b4: typingsSlinky.chessJs.chessJsStrings.b4 = "b4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b4]
    
    @scala.inline
    def b5: typingsSlinky.chessJs.chessJsStrings.b5 = "b5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b5]
    
    @scala.inline
    def b6: typingsSlinky.chessJs.chessJsStrings.b6 = "b6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b6]
    
    @scala.inline
    def b7: typingsSlinky.chessJs.chessJsStrings.b7 = "b7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b7]
    
    @scala.inline
    def b8: typingsSlinky.chessJs.chessJsStrings.b8 = "b8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.b8]
    
    @scala.inline
    def c1: typingsSlinky.chessJs.chessJsStrings.c1 = "c1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c1]
    
    @scala.inline
    def c2: typingsSlinky.chessJs.chessJsStrings.c2 = "c2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c2]
    
    @scala.inline
    def c3: typingsSlinky.chessJs.chessJsStrings.c3 = "c3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c3]
    
    @scala.inline
    def c4: typingsSlinky.chessJs.chessJsStrings.c4 = "c4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c4]
    
    @scala.inline
    def c5: typingsSlinky.chessJs.chessJsStrings.c5 = "c5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c5]
    
    @scala.inline
    def c6: typingsSlinky.chessJs.chessJsStrings.c6 = "c6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c6]
    
    @scala.inline
    def c7: typingsSlinky.chessJs.chessJsStrings.c7 = "c7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c7]
    
    @scala.inline
    def c8: typingsSlinky.chessJs.chessJsStrings.c8 = "c8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.c8]
    
    @scala.inline
    def d1: typingsSlinky.chessJs.chessJsStrings.d1 = "d1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d1]
    
    @scala.inline
    def d2: typingsSlinky.chessJs.chessJsStrings.d2 = "d2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d2]
    
    @scala.inline
    def d3: typingsSlinky.chessJs.chessJsStrings.d3 = "d3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d3]
    
    @scala.inline
    def d4: typingsSlinky.chessJs.chessJsStrings.d4 = "d4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d4]
    
    @scala.inline
    def d5: typingsSlinky.chessJs.chessJsStrings.d5 = "d5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d5]
    
    @scala.inline
    def d6: typingsSlinky.chessJs.chessJsStrings.d6 = "d6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d6]
    
    @scala.inline
    def d7: typingsSlinky.chessJs.chessJsStrings.d7 = "d7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d7]
    
    @scala.inline
    def d8: typingsSlinky.chessJs.chessJsStrings.d8 = "d8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.d8]
    
    @scala.inline
    def e1: typingsSlinky.chessJs.chessJsStrings.e1 = "e1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e1]
    
    @scala.inline
    def e2: typingsSlinky.chessJs.chessJsStrings.e2 = "e2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e2]
    
    @scala.inline
    def e3: typingsSlinky.chessJs.chessJsStrings.e3 = "e3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e3]
    
    @scala.inline
    def e4: typingsSlinky.chessJs.chessJsStrings.e4 = "e4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e4]
    
    @scala.inline
    def e5: typingsSlinky.chessJs.chessJsStrings.e5 = "e5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e5]
    
    @scala.inline
    def e6: typingsSlinky.chessJs.chessJsStrings.e6 = "e6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e6]
    
    @scala.inline
    def e7: typingsSlinky.chessJs.chessJsStrings.e7 = "e7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e7]
    
    @scala.inline
    def e8: typingsSlinky.chessJs.chessJsStrings.e8 = "e8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.e8]
    
    @scala.inline
    def f1: typingsSlinky.chessJs.chessJsStrings.f1 = "f1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f1]
    
    @scala.inline
    def f2: typingsSlinky.chessJs.chessJsStrings.f2 = "f2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f2]
    
    @scala.inline
    def f3: typingsSlinky.chessJs.chessJsStrings.f3 = "f3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f3]
    
    @scala.inline
    def f4: typingsSlinky.chessJs.chessJsStrings.f4 = "f4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f4]
    
    @scala.inline
    def f5: typingsSlinky.chessJs.chessJsStrings.f5 = "f5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f5]
    
    @scala.inline
    def f6: typingsSlinky.chessJs.chessJsStrings.f6 = "f6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f6]
    
    @scala.inline
    def f7: typingsSlinky.chessJs.chessJsStrings.f7 = "f7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f7]
    
    @scala.inline
    def f8: typingsSlinky.chessJs.chessJsStrings.f8 = "f8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.f8]
    
    @scala.inline
    def g1: typingsSlinky.chessJs.chessJsStrings.g1 = "g1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g1]
    
    @scala.inline
    def g2: typingsSlinky.chessJs.chessJsStrings.g2 = "g2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g2]
    
    @scala.inline
    def g3: typingsSlinky.chessJs.chessJsStrings.g3 = "g3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g3]
    
    @scala.inline
    def g4: typingsSlinky.chessJs.chessJsStrings.g4 = "g4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g4]
    
    @scala.inline
    def g5: typingsSlinky.chessJs.chessJsStrings.g5 = "g5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g5]
    
    @scala.inline
    def g6: typingsSlinky.chessJs.chessJsStrings.g6 = "g6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g6]
    
    @scala.inline
    def g7: typingsSlinky.chessJs.chessJsStrings.g7 = "g7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g7]
    
    @scala.inline
    def g8: typingsSlinky.chessJs.chessJsStrings.g8 = "g8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.g8]
    
    @scala.inline
    def h1: typingsSlinky.chessJs.chessJsStrings.h1 = "h1".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h1]
    
    @scala.inline
    def h2: typingsSlinky.chessJs.chessJsStrings.h2 = "h2".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h2]
    
    @scala.inline
    def h3: typingsSlinky.chessJs.chessJsStrings.h3 = "h3".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h3]
    
    @scala.inline
    def h4: typingsSlinky.chessJs.chessJsStrings.h4 = "h4".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h4]
    
    @scala.inline
    def h5: typingsSlinky.chessJs.chessJsStrings.h5 = "h5".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h5]
    
    @scala.inline
    def h6: typingsSlinky.chessJs.chessJsStrings.h6 = "h6".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h6]
    
    @scala.inline
    def h7: typingsSlinky.chessJs.chessJsStrings.h7 = "h7".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h7]
    
    @scala.inline
    def h8: typingsSlinky.chessJs.chessJsStrings.h8 = "h8".asInstanceOf[typingsSlinky.chessJs.chessJsStrings.h8]
  }
}
