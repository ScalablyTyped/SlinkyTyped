package typingsSlinky.karmaMochaReporter

import typingsSlinky.karmaMochaReporter.mod.OutputOptions
import typingsSlinky.karmaMochaReporter.mod.ReporterColor
import typingsSlinky.karmaMochaReporter.mod.ShowDiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object karmaMochaReporterStrings {
  
  @scala.inline
  def autowatch: autowatch = "autowatch".asInstanceOf[autowatch]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @scala.inline
  def minimal: minimal = "minimal".asInstanceOf[minimal]
  
  @scala.inline
  def noFailures: noFailures = "noFailures".asInstanceOf[noFailures]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def unified: unified = "unified".asInstanceOf[unified]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait autowatch extends OutputOptions
  
  @js.native
  sealed trait error extends ReporterColor
  
  @js.native
  sealed trait full extends OutputOptions
  
  @js.native
  sealed trait info extends ReporterColor
  
  @js.native
  sealed trait `inline` extends ShowDiffOptions
  
  @js.native
  sealed trait minimal extends OutputOptions
  
  @js.native
  sealed trait noFailures extends OutputOptions
  
  @js.native
  sealed trait success extends ReporterColor
  
  @js.native
  sealed trait unified extends ShowDiffOptions
  
  @js.native
  sealed trait warning extends ReporterColor
}
