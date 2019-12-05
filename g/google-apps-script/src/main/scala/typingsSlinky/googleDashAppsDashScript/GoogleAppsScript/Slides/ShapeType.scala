package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
  * More information on those shapes can be found in the description of the "ST_ShapeType" simple
  * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
  * Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait ARC extends ShapeType
  
  @js.native
  sealed trait ARROW_EAST extends ShapeType
  
  @js.native
  sealed trait ARROW_NORTH extends ShapeType
  
  @js.native
  sealed trait ARROW_NORTH_EAST extends ShapeType
  
  @js.native
  sealed trait BENT_ARROW extends ShapeType
  
  @js.native
  sealed trait BENT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait BEVEL extends ShapeType
  
  @js.native
  sealed trait BLOCK_ARC extends ShapeType
  
  @js.native
  sealed trait BRACE_PAIR extends ShapeType
  
  @js.native
  sealed trait BRACKET_PAIR extends ShapeType
  
  @js.native
  sealed trait CAN extends ShapeType
  
  @js.native
  sealed trait CHEVRON extends ShapeType
  
  @js.native
  sealed trait CHORD extends ShapeType
  
  @js.native
  sealed trait CLOUD extends ShapeType
  
  @js.native
  sealed trait CLOUD_CALLOUT extends ShapeType
  
  @js.native
  sealed trait CORNER extends ShapeType
  
  @js.native
  sealed trait CUBE extends ShapeType
  
  @js.native
  sealed trait CURVED_DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_LEFT_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait CUSTOM extends ShapeType
  
  @js.native
  sealed trait DECAGON extends ShapeType
  
  @js.native
  sealed trait DIAGONAL_STRIPE extends ShapeType
  
  @js.native
  sealed trait DIAMOND extends ShapeType
  
  @js.native
  sealed trait DODECAGON extends ShapeType
  
  @js.native
  sealed trait DONUT extends ShapeType
  
  @js.native
  sealed trait DOUBLE_WAVE extends ShapeType
  
  @js.native
  sealed trait DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait DOWN_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait ELLIPSE extends ShapeType
  
  @js.native
  sealed trait ELLIPSE_RIBBON extends ShapeType
  
  @js.native
  sealed trait ELLIPSE_RIBBON_2 extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_ALTERNATE_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_COLLATE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_CONNECTOR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DECISION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DELAY extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DISPLAY extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DOCUMENT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_EXTRACT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_INPUT_OUTPUT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_INTERNAL_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_DISK extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_DRUM extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_TAPE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MANUAL_INPUT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MANUAL_OPERATION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MERGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MULTIDOCUMENT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OFFLINE_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OFFPAGE_CONNECTOR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_ONLINE_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PREDEFINED_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PREPARATION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PUNCHED_CARD extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PUNCHED_TAPE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_SORT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_SUMMING_JUNCTION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_TERMINATOR extends ShapeType
  
  @js.native
  sealed trait FOLDED_CORNER extends ShapeType
  
  @js.native
  sealed trait FRAME extends ShapeType
  
  @js.native
  sealed trait HALF_FRAME extends ShapeType
  
  @js.native
  sealed trait HEART extends ShapeType
  
  @js.native
  sealed trait HEPTAGON extends ShapeType
  
  @js.native
  sealed trait HEXAGON extends ShapeType
  
  @js.native
  sealed trait HOME_PLATE extends ShapeType
  
  @js.native
  sealed trait HORIZONTAL_SCROLL extends ShapeType
  
  @js.native
  sealed trait IRREGULAR_SEAL_1 extends ShapeType
  
  @js.native
  sealed trait IRREGULAR_SEAL_2 extends ShapeType
  
  @js.native
  sealed trait LEFT_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait LEFT_BRACE extends ShapeType
  
  @js.native
  sealed trait LEFT_BRACKET extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait LIGHTNING_BOLT extends ShapeType
  
  @js.native
  sealed trait MATH_DIVIDE extends ShapeType
  
  @js.native
  sealed trait MATH_EQUAL extends ShapeType
  
  @js.native
  sealed trait MATH_MINUS extends ShapeType
  
  @js.native
  sealed trait MATH_MULTIPLY extends ShapeType
  
  @js.native
  sealed trait MATH_NOT_EQUAL extends ShapeType
  
  @js.native
  sealed trait MATH_PLUS extends ShapeType
  
  @js.native
  sealed trait MOON extends ShapeType
  
  @js.native
  sealed trait NOTCHED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait NO_SMOKING extends ShapeType
  
  @js.native
  sealed trait OCTAGON extends ShapeType
  
  @js.native
  sealed trait PARALLELOGRAM extends ShapeType
  
  @js.native
  sealed trait PENTAGON extends ShapeType
  
  @js.native
  sealed trait PIE extends ShapeType
  
  @js.native
  sealed trait PLAQUE extends ShapeType
  
  @js.native
  sealed trait PLUS extends ShapeType
  
  @js.native
  sealed trait QUAD_ARROW extends ShapeType
  
  @js.native
  sealed trait QUAD_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait RECTANGLE extends ShapeType
  
  @js.native
  sealed trait RIBBON extends ShapeType
  
  @js.native
  sealed trait RIBBON_2 extends ShapeType
  
  @js.native
  sealed trait RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait RIGHT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait RIGHT_BRACE extends ShapeType
  
  @js.native
  sealed trait RIGHT_BRACKET extends ShapeType
  
  @js.native
  sealed trait RIGHT_TRIANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_1_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_2_DIAGONAL_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_2_SAME_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SMILEY_FACE extends ShapeType
  
  @js.native
  sealed trait SNIP_1_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_2_DIAGONAL_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_2_SAME_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_ROUND_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SPEECH extends ShapeType
  
  @js.native
  sealed trait STARBURST extends ShapeType
  
  @js.native
  sealed trait STAR_10 extends ShapeType
  
  @js.native
  sealed trait STAR_12 extends ShapeType
  
  @js.native
  sealed trait STAR_16 extends ShapeType
  
  @js.native
  sealed trait STAR_24 extends ShapeType
  
  @js.native
  sealed trait STAR_32 extends ShapeType
  
  @js.native
  sealed trait STAR_4 extends ShapeType
  
  @js.native
  sealed trait STAR_5 extends ShapeType
  
  @js.native
  sealed trait STAR_6 extends ShapeType
  
  @js.native
  sealed trait STAR_7 extends ShapeType
  
  @js.native
  sealed trait STAR_8 extends ShapeType
  
  @js.native
  sealed trait STRIPED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait SUN extends ShapeType
  
  @js.native
  sealed trait TEARDROP extends ShapeType
  
  @js.native
  sealed trait TEXT_BOX extends ShapeType
  
  @js.native
  sealed trait TRAPEZOID extends ShapeType
  
  @js.native
  sealed trait TRIANGLE extends ShapeType
  
  @js.native
  sealed trait UNSUPPORTED extends ShapeType
  
  @js.native
  sealed trait UP_ARROW extends ShapeType
  
  @js.native
  sealed trait UP_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait UP_DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait UTURN_ARROW extends ShapeType
  
  @js.native
  sealed trait VERTICAL_SCROLL extends ShapeType
  
  @js.native
  sealed trait WAVE extends ShapeType
  
  @js.native
  sealed trait WEDGE_ELLIPSE_CALLOUT extends ShapeType
  
  @js.native
  sealed trait WEDGE_RECTANGLE_CALLOUT extends ShapeType
  
  @js.native
  sealed trait WEDGE_ROUND_RECTANGLE_CALLOUT extends ShapeType
  
  /* 5 */ val ARC: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ARC with Double = js.native
  /* 133 */ val ARROW_EAST: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ARROW_EAST with Double = js.native
  /* 135 */ val ARROW_NORTH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH with Double = js.native
  /* 134 */ val ARROW_NORTH_EAST: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ARROW_NORTH_EAST with Double = js.native
  /* 6 */ val BENT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BENT_ARROW with Double = js.native
  /* 7 */ val BENT_UP_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BENT_UP_ARROW with Double = js.native
  /* 8 */ val BEVEL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BEVEL with Double = js.native
  /* 9 */ val BLOCK_ARC: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BLOCK_ARC with Double = js.native
  /* 10 */ val BRACE_PAIR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BRACE_PAIR with Double = js.native
  /* 11 */ val BRACKET_PAIR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.BRACKET_PAIR with Double = js.native
  /* 12 */ val CAN: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CAN with Double = js.native
  /* 13 */ val CHEVRON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CHEVRON with Double = js.native
  /* 14 */ val CHORD: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CHORD with Double = js.native
  /* 15 */ val CLOUD: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CLOUD with Double = js.native
  /* 141 */ val CLOUD_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CLOUD_CALLOUT with Double = js.native
  /* 16 */ val CORNER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CORNER with Double = js.native
  /* 17 */ val CUBE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CUBE with Double = js.native
  /* 18 */ val CURVED_DOWN_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CURVED_DOWN_ARROW with Double = js.native
  /* 19 */ val CURVED_LEFT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CURVED_LEFT_ARROW with Double = js.native
  /* 20 */ val CURVED_RIGHT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CURVED_RIGHT_ARROW with Double = js.native
  /* 21 */ val CURVED_UP_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CURVED_UP_ARROW with Double = js.native
  /* 142 */ val CUSTOM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.CUSTOM with Double = js.native
  /* 22 */ val DECAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DECAGON with Double = js.native
  /* 23 */ val DIAGONAL_STRIPE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DIAGONAL_STRIPE with Double = js.native
  /* 24 */ val DIAMOND: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DIAMOND with Double = js.native
  /* 25 */ val DODECAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DODECAGON with Double = js.native
  /* 26 */ val DONUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DONUT with Double = js.native
  /* 27 */ val DOUBLE_WAVE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DOUBLE_WAVE with Double = js.native
  /* 28 */ val DOWN_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW with Double = js.native
  /* 29 */ val DOWN_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.DOWN_ARROW_CALLOUT with Double = js.native
  /* 4 */ val ELLIPSE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE with Double = js.native
  /* 139 */ val ELLIPSE_RIBBON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON with Double = js.native
  /* 140 */ val ELLIPSE_RIBBON_2: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ELLIPSE_RIBBON_2 with Double = js.native
  /* 104 */ val FLOW_CHART_ALTERNATE_PROCESS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ALTERNATE_PROCESS with Double = js.native
  /* 105 */ val FLOW_CHART_COLLATE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_COLLATE with Double = js.native
  /* 106 */ val FLOW_CHART_CONNECTOR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_CONNECTOR with Double = js.native
  /* 107 */ val FLOW_CHART_DECISION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DECISION with Double = js.native
  /* 108 */ val FLOW_CHART_DELAY: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DELAY with Double = js.native
  /* 109 */ val FLOW_CHART_DISPLAY: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DISPLAY with Double = js.native
  /* 110 */ val FLOW_CHART_DOCUMENT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_DOCUMENT with Double = js.native
  /* 111 */ val FLOW_CHART_EXTRACT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_EXTRACT with Double = js.native
  /* 112 */ val FLOW_CHART_INPUT_OUTPUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INPUT_OUTPUT with Double = js.native
  /* 113 */ val FLOW_CHART_INTERNAL_STORAGE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_INTERNAL_STORAGE with Double = js.native
  /* 114 */ val FLOW_CHART_MAGNETIC_DISK: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DISK with Double = js.native
  /* 115 */ val FLOW_CHART_MAGNETIC_DRUM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_DRUM with Double = js.native
  /* 116 */ val FLOW_CHART_MAGNETIC_TAPE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MAGNETIC_TAPE with Double = js.native
  /* 117 */ val FLOW_CHART_MANUAL_INPUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_INPUT with Double = js.native
  /* 118 */ val FLOW_CHART_MANUAL_OPERATION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MANUAL_OPERATION with Double = js.native
  /* 119 */ val FLOW_CHART_MERGE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MERGE with Double = js.native
  /* 120 */ val FLOW_CHART_MULTIDOCUMENT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_MULTIDOCUMENT with Double = js.native
  /* 121 */ val FLOW_CHART_OFFLINE_STORAGE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFLINE_STORAGE with Double = js.native
  /* 122 */ val FLOW_CHART_OFFPAGE_CONNECTOR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OFFPAGE_CONNECTOR with Double = js.native
  /* 123 */ val FLOW_CHART_ONLINE_STORAGE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_ONLINE_STORAGE with Double = js.native
  /* 124 */ val FLOW_CHART_OR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_OR with Double = js.native
  /* 125 */ val FLOW_CHART_PREDEFINED_PROCESS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREDEFINED_PROCESS with Double = js.native
  /* 126 */ val FLOW_CHART_PREPARATION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PREPARATION with Double = js.native
  /* 127 */ val FLOW_CHART_PROCESS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PROCESS with Double = js.native
  /* 128 */ val FLOW_CHART_PUNCHED_CARD: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_CARD with Double = js.native
  /* 129 */ val FLOW_CHART_PUNCHED_TAPE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_PUNCHED_TAPE with Double = js.native
  /* 130 */ val FLOW_CHART_SORT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SORT with Double = js.native
  /* 131 */ val FLOW_CHART_SUMMING_JUNCTION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_SUMMING_JUNCTION with Double = js.native
  /* 132 */ val FLOW_CHART_TERMINATOR: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FLOW_CHART_TERMINATOR with Double = js.native
  /* 30 */ val FOLDED_CORNER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FOLDED_CORNER with Double = js.native
  /* 31 */ val FRAME: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.FRAME with Double = js.native
  /* 32 */ val HALF_FRAME: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HALF_FRAME with Double = js.native
  /* 33 */ val HEART: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HEART with Double = js.native
  /* 34 */ val HEPTAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HEPTAGON with Double = js.native
  /* 35 */ val HEXAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HEXAGON with Double = js.native
  /* 36 */ val HOME_PLATE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HOME_PLATE with Double = js.native
  /* 37 */ val HORIZONTAL_SCROLL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.HORIZONTAL_SCROLL with Double = js.native
  /* 38 */ val IRREGULAR_SEAL_1: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_1 with Double = js.native
  /* 39 */ val IRREGULAR_SEAL_2: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.IRREGULAR_SEAL_2 with Double = js.native
  /* 40 */ val LEFT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW with Double = js.native
  /* 41 */ val LEFT_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_ARROW_CALLOUT with Double = js.native
  /* 42 */ val LEFT_BRACE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACE with Double = js.native
  /* 43 */ val LEFT_BRACKET: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_BRACKET with Double = js.native
  /* 44 */ val LEFT_RIGHT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW with Double = js.native
  /* 45 */ val LEFT_RIGHT_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_ARROW_CALLOUT with Double = js.native
  /* 46 */ val LEFT_RIGHT_UP_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_RIGHT_UP_ARROW with Double = js.native
  /* 47 */ val LEFT_UP_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LEFT_UP_ARROW with Double = js.native
  /* 48 */ val LIGHTNING_BOLT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.LIGHTNING_BOLT with Double = js.native
  /* 49 */ val MATH_DIVIDE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_DIVIDE with Double = js.native
  /* 50 */ val MATH_EQUAL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_EQUAL with Double = js.native
  /* 51 */ val MATH_MINUS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_MINUS with Double = js.native
  /* 52 */ val MATH_MULTIPLY: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_MULTIPLY with Double = js.native
  /* 53 */ val MATH_NOT_EQUAL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_NOT_EQUAL with Double = js.native
  /* 54 */ val MATH_PLUS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MATH_PLUS with Double = js.native
  /* 55 */ val MOON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.MOON with Double = js.native
  /* 57 */ val NOTCHED_RIGHT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.NOTCHED_RIGHT_ARROW with Double = js.native
  /* 56 */ val NO_SMOKING: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.NO_SMOKING with Double = js.native
  /* 58 */ val OCTAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.OCTAGON with Double = js.native
  /* 59 */ val PARALLELOGRAM: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.PARALLELOGRAM with Double = js.native
  /* 60 */ val PENTAGON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.PENTAGON with Double = js.native
  /* 61 */ val PIE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.PIE with Double = js.native
  /* 62 */ val PLAQUE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.PLAQUE with Double = js.native
  /* 63 */ val PLUS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.PLUS with Double = js.native
  /* 64 */ val QUAD_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW with Double = js.native
  /* 65 */ val QUAD_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.QUAD_ARROW_CALLOUT with Double = js.native
  /* 2 */ val RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RECTANGLE with Double = js.native
  /* 66 */ val RIBBON: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIBBON with Double = js.native
  /* 67 */ val RIBBON_2: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIBBON_2 with Double = js.native
  /* 68 */ val RIGHT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW with Double = js.native
  /* 69 */ val RIGHT_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIGHT_ARROW_CALLOUT with Double = js.native
  /* 70 */ val RIGHT_BRACE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACE with Double = js.native
  /* 71 */ val RIGHT_BRACKET: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIGHT_BRACKET with Double = js.native
  /* 75 */ val RIGHT_TRIANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.RIGHT_TRIANGLE with Double = js.native
  /* 72 */ val ROUND_1_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ROUND_1_RECTANGLE with Double = js.native
  /* 73 */ val ROUND_2_DIAGONAL_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_DIAGONAL_RECTANGLE with Double = js.native
  /* 74 */ val ROUND_2_SAME_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ROUND_2_SAME_RECTANGLE with Double = js.native
  /* 3 */ val ROUND_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.ROUND_RECTANGLE with Double = js.native
  /* 76 */ val SMILEY_FACE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SMILEY_FACE with Double = js.native
  /* 77 */ val SNIP_1_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SNIP_1_RECTANGLE with Double = js.native
  /* 78 */ val SNIP_2_DIAGONAL_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_DIAGONAL_RECTANGLE with Double = js.native
  /* 79 */ val SNIP_2_SAME_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SNIP_2_SAME_RECTANGLE with Double = js.native
  /* 80 */ val SNIP_ROUND_RECTANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SNIP_ROUND_RECTANGLE with Double = js.native
  /* 136 */ val SPEECH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SPEECH with Double = js.native
  /* 137 */ val STARBURST: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STARBURST with Double = js.native
  /* 81 */ val STAR_10: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_10 with Double = js.native
  /* 82 */ val STAR_12: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_12 with Double = js.native
  /* 83 */ val STAR_16: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_16 with Double = js.native
  /* 84 */ val STAR_24: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_24 with Double = js.native
  /* 85 */ val STAR_32: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_32 with Double = js.native
  /* 86 */ val STAR_4: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_4 with Double = js.native
  /* 87 */ val STAR_5: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_5 with Double = js.native
  /* 88 */ val STAR_6: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_6 with Double = js.native
  /* 89 */ val STAR_7: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_7 with Double = js.native
  /* 90 */ val STAR_8: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STAR_8 with Double = js.native
  /* 91 */ val STRIPED_RIGHT_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.STRIPED_RIGHT_ARROW with Double = js.native
  /* 92 */ val SUN: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.SUN with Double = js.native
  /* 138 */ val TEARDROP: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.TEARDROP with Double = js.native
  /* 1 */ val TEXT_BOX: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.TEXT_BOX with Double = js.native
  /* 93 */ val TRAPEZOID: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.TRAPEZOID with Double = js.native
  /* 94 */ val TRIANGLE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.TRIANGLE with Double = js.native
  /* 0 */ val UNSUPPORTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.UNSUPPORTED with Double = js.native
  /* 95 */ val UP_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW with Double = js.native
  /* 96 */ val UP_ARROW_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.UP_ARROW_CALLOUT with Double = js.native
  /* 97 */ val UP_DOWN_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.UP_DOWN_ARROW with Double = js.native
  /* 98 */ val UTURN_ARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.UTURN_ARROW with Double = js.native
  /* 99 */ val VERTICAL_SCROLL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.VERTICAL_SCROLL with Double = js.native
  /* 100 */ val WAVE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.WAVE with Double = js.native
  /* 101 */ val WEDGE_ELLIPSE_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ELLIPSE_CALLOUT with Double = js.native
  /* 102 */ val WEDGE_RECTANGLE_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.WEDGE_RECTANGLE_CALLOUT with Double = js.native
  /* 103 */ val WEDGE_ROUND_RECTANGLE_CALLOUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.ShapeType.WEDGE_ROUND_RECTANGLE_CALLOUT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShapeType with Double] = js.native
}

