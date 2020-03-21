package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - ALL for FUNC_GROUP_ALL,
  * - U for FUNC_GROUP_UNKNOWN,
  * - NONE for FUNC_GROUP_NONE,
  * - AGGR for FUNC_GROUP_AGGR,
  * - NUM for FUNC_GROUP_NUMERIC,
  * - RNG for FUNC_GROUP_RANGE,
  * - EXP for FUNC_GROUP_EXPONENTIAL_AND_LOGARITHMIC,
  * - TRIG for FUNC_GROUP_TRIGONOMETRIC_AND_HYPERBOLIC,
  * - FIN for FUNC_GROUP_FINANCIAL,
  * - MATH for FUNC_GROUP_MATH_CONSTANT_AND_PARAM_FREE,
  * - COUNT for FUNC_GROUP_COUNTER,
  * - STR for FUNC_GROUP_STRING,
  * - MAPP for FUNC_GROUP_MAPPING,
  * - RCRD for FUNC_GROUP_INTER_RECORD,
  * - CND for FUNC_GROUP_CONDITIONAL,
  * - LOG for FUNC_GROUP_LOGICAL,
  * - NULL for FUNC_GROUP_NULL,
  * - SYS for FUNC_GROUP_SYSTEM,
  * - FILE for FUNC_GROUP_FILE,
  * - TBL for FUNC_GROUP_TABLE,
  * - DATE for FUNC_GROUP_DATE_AND_TIME,
  * - NUMI for FUNC_GROUP_NUMBER_INTERPRET,
  * - FRMT for FUNC_GROUP_FORMATTING,
  * - CLR for FUNC_GROUP_COLOR,
  * - RNK for FUNC_GROUP_RANKING
  * - GEO for FUNC_GROUP_GEO
  * - EXT for FUNC_GROUP_EXTERNAL
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.ALL
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.U
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NONE
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.AGGR
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NUM
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RNG
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.EXP
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.TRIG
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FIN
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.MATH
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.COUNT
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.STR
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.MAPP
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RCRD
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CND
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.LOG
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NULL
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.SYS
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FILE
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.TBL
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.DATE
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NUMI
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FRMT
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CLR
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RNK
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.GEO
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.EXT
*/
trait FunctionGroupType extends js.Object

object FunctionGroupType {
  @scala.inline
  def AGGR: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.AGGR = this.cast("AGGR")
  @scala.inline
  def ALL: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.ALL = this.cast("ALL")
  @scala.inline
  def CLR: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CLR = this.cast("CLR")
  @scala.inline
  def CND: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.CND = this.cast("CND")
  @scala.inline
  def COUNT: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.COUNT = this.cast("COUNT")
  @scala.inline
  def DATE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.DATE = this.cast("DATE")
  @scala.inline
  def EXP: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.EXP = this.cast("EXP")
  @scala.inline
  def EXT: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.EXT = this.cast("EXT")
  @scala.inline
  def FILE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FIN: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FIN = this.cast("FIN")
  @scala.inline
  def FRMT: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FRMT = this.cast("FRMT")
  @scala.inline
  def GEO: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.GEO = this.cast("GEO")
  @scala.inline
  def LOG: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.LOG = this.cast("LOG")
  @scala.inline
  def MAPP: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.MAPP = this.cast("MAPP")
  @scala.inline
  def MATH: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.MATH = this.cast("MATH")
  @scala.inline
  def NONE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NONE = this.cast("NONE")
  @scala.inline
  def NULL: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NULL = this.cast("NULL")
  @scala.inline
  def NUM: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NUM = this.cast("NUM")
  @scala.inline
  def NUMI: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.NUMI = this.cast("NUMI")
  @scala.inline
  def RCRD: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RCRD = this.cast("RCRD")
  @scala.inline
  def RNG: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RNG = this.cast("RNG")
  @scala.inline
  def RNK: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.RNK = this.cast("RNK")
  @scala.inline
  def STR: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.STR = this.cast("STR")
  @scala.inline
  def SYS: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.SYS = this.cast("SYS")
  @scala.inline
  def TBL: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.TBL = this.cast("TBL")
  @scala.inline
  def TRIG: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.TRIG = this.cast("TRIG")
  @scala.inline
  def U: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.U = this.cast("U")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

