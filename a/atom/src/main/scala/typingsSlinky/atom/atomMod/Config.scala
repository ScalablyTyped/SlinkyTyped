package typingsSlinky.atom.atomMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atom.Anon_Always
import typingsSlinky.atom.Anon_AlwaysNo
import typingsSlinky.atom.Anon_Atom
import typingsSlinky.atom.Anon_AtomExperimental
import typingsSlinky.atom.Anon_Auto
import typingsSlinky.atom.Anon_AutoHard
import typingsSlinky.atom.Anon_Cursor
import typingsSlinky.atom.Anon_CursorScopeDescriptor
import typingsSlinky.atom.Anon_Default
import typingsSlinky.atom.Anon_DefaultScopeDescriptor
import typingsSlinky.atom.Anon_Enter
import typingsSlinky.atom.Anon_EnterScopeDescriptor
import typingsSlinky.atom.Anon_ExcludeSources
import typingsSlinky.atom.Anon_ExcludeSourcesScope
import typingsSlinky.atom.Anon_Key
import typingsSlinky.atom.Anon_KeyScopeDescriptor
import typingsSlinky.atom.Anon_Limited
import typingsSlinky.atom.Anon_LimitedNo
import typingsSlinky.atom.Anon_NewValue
import typingsSlinky.atom.Anon_NewValueNone
import typingsSlinky.atom.Anon_NewValueOldValue
import typingsSlinky.atom.Anon_NewValueOldValueBoolean
import typingsSlinky.atom.Anon_NewValueOldValueFileEncoding
import typingsSlinky.atom.Anon_NewValueOldValueInvisibles
import typingsSlinky.atom.Anon_NewValueOldValueNull
import typingsSlinky.atom.Anon_NewValueOldValueNumber
import typingsSlinky.atom.Anon_NewValueOldValueNumberString
import typingsSlinky.atom.Anon_NewValueOldValueString
import typingsSlinky.atom.Anon_NewValueOldValueSubsequence
import typingsSlinky.atom.Anon_None
import typingsSlinky.atom.Anon_Scope
import typingsSlinky.atom.Anon_ScopeDescriptor
import typingsSlinky.atom.Anon_ScopeDescriptorSubsequence
import typingsSlinky.atom.Anon_ScopeDescriptorValue
import typingsSlinky.atom.Anon_ScopeDescriptorValueFileEncoding
import typingsSlinky.atom.Anon_ScopeDescriptorValueInvisibles
import typingsSlinky.atom.Anon_ScopeDescriptorValueNull
import typingsSlinky.atom.Anon_ScopeDescriptorValueNumber
import typingsSlinky.atom.Anon_ScopeDescriptorValueNumberString
import typingsSlinky.atom.Anon_ScopeDescriptorValueString
import typingsSlinky.atom.Anon_ScopeSelector
import typingsSlinky.atom.atomStrings.Subsequence
import typingsSlinky.atom.atomStrings.Symbol
import typingsSlinky.atom.atomStrings.Word
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTautoActivationDelay`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTbackspaceTriggersAutocomplete`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTbuiltinProviderBlacklist`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTconfirmCompletion`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTconsumeSuffix`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTdefaultProvider`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTenableAutoActivation`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTenableAutoConfirmSingleSuggestion`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTenableBuiltinProvider`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTenableExtendedUnicodeSupport`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTfileBlacklist`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTincludeCompletionsFromAllBuffers`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTmaxVisibleSuggestions`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTminimumWordLength`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTscopeBlacklist`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTsimilarSuggestionRemoval`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTstrictMatching`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTsuggestionListFollows`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTsuppressActivationForEditorClasses`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTuseAlternateScoring`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTuseCoreMovementCommands`
import typingsSlinky.atom.atomStrings.`autocomplete-plusDOTuseLocalityBonus`
import typingsSlinky.atom.atomStrings.`status-barDOTcursorPositionFormat`
import typingsSlinky.atom.atomStrings.`status-barDOTfullWidth`
import typingsSlinky.atom.atomStrings.`status-barDOTisVisible`
import typingsSlinky.atom.atomStrings.`status-barDOTselectionCountFormat`
import typingsSlinky.atom.atomStrings.`tab always, enter when suggestion explicitly selected`
import typingsSlinky.atom.atomStrings.`tab and enter`
import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.auto
import typingsSlinky.atom.atomStrings.coreDOTallowPendingPaneItems
import typingsSlinky.atom.atomStrings.coreDOTaudioBeep
import typingsSlinky.atom.atomStrings.coreDOTautomaticallyUpdate
import typingsSlinky.atom.atomStrings.coreDOTcloseDeletedFileTabs
import typingsSlinky.atom.atomStrings.coreDOTcloseEmptyWindows
import typingsSlinky.atom.atomStrings.coreDOTcolorProfile
import typingsSlinky.atom.atomStrings.coreDOTcustomFileTypes
import typingsSlinky.atom.atomStrings.coreDOTdestroyEmptyPanes
import typingsSlinky.atom.atomStrings.coreDOTdisabledPackages
import typingsSlinky.atom.atomStrings.coreDOTexcludeVcsIgnoredPaths
import typingsSlinky.atom.atomStrings.coreDOTfileEncoding
import typingsSlinky.atom.atomStrings.coreDOTfileSystemWatcher
import typingsSlinky.atom.atomStrings.coreDOTfollowSymlinks
import typingsSlinky.atom.atomStrings.coreDOTignoredNames
import typingsSlinky.atom.atomStrings.coreDOTopenEmptyEditorOnStart
import typingsSlinky.atom.atomStrings.coreDOTreopenProjectMenuCount
import typingsSlinky.atom.atomStrings.coreDOTrestorePreviousWindowsOnStart
import typingsSlinky.atom.atomStrings.coreDOTtelemetryConsent
import typingsSlinky.atom.atomStrings.coreDOTthemes
import typingsSlinky.atom.atomStrings.coreDOTuseProxySettingsWhenCallingApm
import typingsSlinky.atom.atomStrings.coreDOTuseTreeSitterParsers
import typingsSlinky.atom.atomStrings.coreDOTversionPinnedPackages
import typingsSlinky.atom.atomStrings.coreDOTwarnOnLargeFileLimit
import typingsSlinky.atom.atomStrings.default
import typingsSlinky.atom.atomStrings.editorDOTatomicSoftTabs
import typingsSlinky.atom.atomStrings.editorDOTautoIndent
import typingsSlinky.atom.atomStrings.editorDOTautoIndentOnPaste
import typingsSlinky.atom.atomStrings.editorDOTcommentEnd
import typingsSlinky.atom.atomStrings.editorDOTcommentStart
import typingsSlinky.atom.atomStrings.editorDOTconfirmCheckoutHeadRevision
import typingsSlinky.atom.atomStrings.editorDOTdecreaseIndentPattern
import typingsSlinky.atom.atomStrings.editorDOTfoldEndPattern
import typingsSlinky.atom.atomStrings.editorDOTfontFamily
import typingsSlinky.atom.atomStrings.editorDOTfontSize
import typingsSlinky.atom.atomStrings.editorDOTincreaseIndentPattern
import typingsSlinky.atom.atomStrings.editorDOTinvisibles
import typingsSlinky.atom.atomStrings.editorDOTlineHeight
import typingsSlinky.atom.atomStrings.editorDOTmaxScreenLineLength
import typingsSlinky.atom.atomStrings.editorDOTnonWordCharacters
import typingsSlinky.atom.atomStrings.editorDOTpreferredLineLength
import typingsSlinky.atom.atomStrings.editorDOTscrollPastEnd
import typingsSlinky.atom.atomStrings.editorDOTscrollSensitivity
import typingsSlinky.atom.atomStrings.editorDOTshowCursorOnSelection
import typingsSlinky.atom.atomStrings.editorDOTshowIndentGuide
import typingsSlinky.atom.atomStrings.editorDOTshowInvisibles
import typingsSlinky.atom.atomStrings.editorDOTshowLineNumbers
import typingsSlinky.atom.atomStrings.editorDOTsoftTabs
import typingsSlinky.atom.atomStrings.editorDOTsoftWrap
import typingsSlinky.atom.atomStrings.editorDOTsoftWrapAtPreferredLineLength
import typingsSlinky.atom.atomStrings.editorDOTsoftWrapHangingIndent
import typingsSlinky.atom.atomStrings.editorDOTtabLength
import typingsSlinky.atom.atomStrings.editorDOTtabType
import typingsSlinky.atom.atomStrings.editorDOTundoGroupingInterval
import typingsSlinky.atom.atomStrings.editorDOTzoomFontWhenCtrlScrolling
import typingsSlinky.atom.atomStrings.enter
import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.hard
import typingsSlinky.atom.atomStrings.limited
import typingsSlinky.atom.atomStrings.linterDOTdisabledProviders
import typingsSlinky.atom.atomStrings.linterDOTignoreGlob
import typingsSlinky.atom.atomStrings.linterDOTlintOnChange
import typingsSlinky.atom.atomStrings.linterDOTlintOnChangeInterval
import typingsSlinky.atom.atomStrings.linterDOTlintOnOpen
import typingsSlinky.atom.atomStrings.linterDOTlintPreviewTabs
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.none
import typingsSlinky.atom.atomStrings.poll
import typingsSlinky.atom.atomStrings.soft
import typingsSlinky.atom.atomStrings.srgb
import typingsSlinky.atom.atomStrings.tab
import typingsSlinky.atom.atomStrings.textOrSnippet
import typingsSlinky.atom.atomStrings.undecided
import typingsSlinky.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  @JSName("getAll")
  def getAll_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusbackspaceTriggersAutocomplete(keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusbackspaceTriggersAutocomplete(keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusbuiltinProviderBlacklist(keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusbuiltinProviderBlacklist(keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusconfirmCompletion(keyPath: `autocomplete-plusDOTconfirmCompletion`): js.Array[Anon_EnterScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusconfirmCompletion(keyPath: `autocomplete-plusDOTconfirmCompletion`, options: Anon_ExcludeSourcesScope): js.Array[Anon_EnterScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusdefaultProvider(keyPath: `autocomplete-plusDOTdefaultProvider`): js.Array[Anon_ScopeDescriptorSubsequence] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusdefaultProvider(keyPath: `autocomplete-plusDOTdefaultProvider`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorSubsequence] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableAutoConfirmSingleSuggestion(keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    options: Anon_ExcludeSourcesScope
  ): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableExtendedUnicodeSupport(keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusenableExtendedUnicodeSupport(keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusincludeCompletionsFromAllBuffers(keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusincludeCompletionsFromAllBuffers(keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusscopeBlacklist(keyPath: `autocomplete-plusDOTscopeBlacklist`): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusscopeBlacklist(keyPath: `autocomplete-plusDOTscopeBlacklist`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussimilarSuggestionRemoval(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`): js.Array[Anon_None] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussimilarSuggestionRemoval(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`, options: Anon_ExcludeSourcesScope): js.Array[Anon_None] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussuggestionListFollows(keyPath: `autocomplete-plusDOTsuggestionListFollows`): js.Array[Anon_CursorScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussuggestionListFollows(keyPath: `autocomplete-plusDOTsuggestionListFollows`, options: Anon_ExcludeSourcesScope): js.Array[Anon_CursorScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussuppressActivationForEditorClasses(keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    options: Anon_ExcludeSourcesScope
  ): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeCoreMovementCommands(keyPath: `autocomplete-plusDOTuseCoreMovementCommands`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeCoreMovementCommands(keyPath: `autocomplete-plusDOTuseCoreMovementCommands`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreaudioBeep(keyPath: coreDOTaudioBeep): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corecolorProfile(keyPath: coreDOTcolorProfile): js.Array[Anon_DefaultScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecolorProfile(keyPath: coreDOTcolorProfile, options: Anon_ExcludeSourcesScope): js.Array[Anon_DefaultScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecustomFileTypes(keyPath: coreDOTcustomFileTypes): js.Array[Anon_KeyScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, options: Anon_ExcludeSourcesScope): js.Array[Anon_KeyScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coredisabledPackages(keyPath: coreDOTdisabledPackages): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coredisabledPackages(keyPath: coreDOTdisabledPackages, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corefileEncoding(keyPath: coreDOTfileEncoding): js.Array[Anon_ScopeDescriptorValueFileEncoding] = js.native
  @JSName("getAll")
  def getAll_corefileEncoding(keyPath: coreDOTfileEncoding, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueFileEncoding] = js.native
  @JSName("getAll")
  def getAll_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher): js.Array[Anon_AtomExperimental] = js.native
  @JSName("getAll")
  def getAll_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, options: Anon_ExcludeSourcesScope): js.Array[Anon_AtomExperimental] = js.native
  @JSName("getAll")
  def getAll_corefollowSymlinks(keyPath: coreDOTfollowSymlinks): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  /**
    *  Get all of the values for the given key-path, along with their associated
    *  scope selector.
    */
  @JSName("getAll")
  def getAll_coreignoredNames(keyPath: coreDOTignoredNames): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreignoredNames(keyPath: coreDOTignoredNames, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart): js.Array[Anon_AlwaysNo] = js.native
  @JSName("getAll")
  def getAll_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_AlwaysNo] = js.native
  @JSName("getAll")
  def getAll_coretelemetryConsent(keyPath: coreDOTtelemetryConsent): js.Array[Anon_LimitedNo] = js.native
  @JSName("getAll")
  def getAll_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, options: Anon_ExcludeSourcesScope): js.Array[Anon_LimitedNo] = js.native
  @JSName("getAll")
  def getAll_corethemes(keyPath: coreDOTthemes): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corethemes(keyPath: coreDOTthemes, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndent(keyPath: editorDOTautoIndent): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndent(keyPath: editorDOTautoIndent, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorcommentEnd(keyPath: editorDOTcommentEnd): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentEnd(keyPath: editorDOTcommentEnd, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentStart(keyPath: editorDOTcommentStart): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorcommentStart(keyPath: editorDOTcommentStart, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorfontFamily(keyPath: editorDOTfontFamily): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorfontFamily(keyPath: editorDOTfontFamily, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorfontSize(keyPath: editorDOTfontSize): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorfontSize(keyPath: editorDOTfontSize, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNull] = js.native
  @JSName("getAll")
  def getAll_editorinvisibles(keyPath: editorDOTinvisibles): js.Array[Anon_ScopeDescriptorValueInvisibles] = js.native
  @JSName("getAll")
  def getAll_editorinvisibles(keyPath: editorDOTinvisibles, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueInvisibles] = js.native
  @JSName("getAll")
  def getAll_editorlineHeight(keyPath: editorDOTlineHeight): js.Array[Anon_ScopeDescriptorValueNumberString] = js.native
  @JSName("getAll")
  def getAll_editorlineHeight(keyPath: editorDOTlineHeight, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumberString] = js.native
  @JSName("getAll")
  def getAll_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editornonWordCharacters(keyPath: editorDOTnonWordCharacters): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowInvisibles(keyPath: editorDOTshowInvisibles): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowInvisibles(keyPath: editorDOTshowInvisibles, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftTabs(keyPath: editorDOTsoftTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrap(keyPath: editorDOTsoftWrap): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabLength(keyPath: editorDOTtabLength): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabLength(keyPath: editorDOTtabLength, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editortabType(keyPath: editorDOTtabType): js.Array[Anon_AutoHard] = js.native
  @JSName("getAll")
  def getAll_editortabType(keyPath: editorDOTtabType, options: Anon_ExcludeSourcesScope): js.Array[Anon_AutoHard] = js.native
  @JSName("getAll")
  def getAll_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterdisabledProviders(keyPath: linterDOTdisabledProviders): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_linterdisabledProviders(keyPath: linterDOTdisabledProviders, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptor] = js.native
  @JSName("getAll")
  def getAll_linterignoreGlob(keyPath: linterDOTignoreGlob): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_linterignoreGlob(keyPath: linterDOTignoreGlob, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_linterlintOnChange(keyPath: linterDOTlintOnChange): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterlintOnChange(keyPath: linterDOTlintOnChange, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueNumber] = js.native
  @JSName("getAll")
  def getAll_linterlintOnOpen(keyPath: linterDOTlintOnOpen): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterlintOnOpen(keyPath: linterDOTlintOnOpen, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_statusbarfullWidth(keyPath: `status-barDOTfullWidth`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_statusbarfullWidth(keyPath: `status-barDOTfullWidth`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_statusbarisVisible(keyPath: `status-barDOTisVisible`): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_statusbarisVisible(keyPath: `status-barDOTisVisible`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValue] = js.native
  @JSName("getAll")
  def getAll_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`): js.Array[Anon_ScopeDescriptorValueString] = js.native
  @JSName("getAll")
  def getAll_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`, options: Anon_ExcludeSourcesScope): js.Array[Anon_ScopeDescriptorValueString] = js.native
  /**
    *  Retrieve the schema for a specific key path. The schema will tell you what type
    *  the keyPath expects, and other metadata about the config option.
    */
  def getSchema(keyPath: String): js.Object | Null = js.native
  /**
    *  Get an Array of all of the source Strings with which settings have been added
    *  via ::set.
    */
  def getSources(): js.Array[String] = js.native
  /** Get the string path to the config file being used. */
  def getUserConfigPath(): String = js.native
  @JSName("get")
  def get_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`): Double = js.native
  @JSName("get")
  def get_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_autocompleteplusbackspaceTriggersAutocomplete(keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusbackspaceTriggersAutocomplete(keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusbuiltinProviderBlacklist(keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`): String = js.native
  @JSName("get")
  def get_autocompleteplusbuiltinProviderBlacklist(keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_autocompleteplusconfirmCompletion(keyPath: `autocomplete-plusDOTconfirmCompletion`): tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`) = js.native
  @JSName("get")
  def get_autocompleteplusconfirmCompletion(keyPath: `autocomplete-plusDOTconfirmCompletion`, options: Anon_ExcludeSources): tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`) = js.native
  @JSName("get")
  def get_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusdefaultProvider(keyPath: `autocomplete-plusDOTdefaultProvider`): Subsequence | Symbol = js.native
  @JSName("get")
  def get_autocompleteplusdefaultProvider(keyPath: `autocomplete-plusDOTdefaultProvider`, options: Anon_ExcludeSources): Subsequence | Symbol = js.native
  @JSName("get")
  def get_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableAutoConfirmSingleSuggestion(keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableAutoConfirmSingleSuggestion(keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableExtendedUnicodeSupport(keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusenableExtendedUnicodeSupport(keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplusincludeCompletionsFromAllBuffers(keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusincludeCompletionsFromAllBuffers(keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`): Double = js.native
  @JSName("get")
  def get_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`): Double = js.native
  @JSName("get")
  def get_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_autocompleteplusscopeBlacklist(keyPath: `autocomplete-plusDOTscopeBlacklist`): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplusscopeBlacklist(keyPath: `autocomplete-plusDOTscopeBlacklist`, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplussimilarSuggestionRemoval(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`): none | textOrSnippet = js.native
  @JSName("get")
  def get_autocompleteplussimilarSuggestionRemoval(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`, options: Anon_ExcludeSources): none | textOrSnippet = js.native
  @JSName("get")
  def get_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplussuggestionListFollows(keyPath: `autocomplete-plusDOTsuggestionListFollows`): Word | typingsSlinky.atom.atomStrings.Cursor = js.native
  @JSName("get")
  def get_autocompleteplussuggestionListFollows(keyPath: `autocomplete-plusDOTsuggestionListFollows`, options: Anon_ExcludeSources): Word | typingsSlinky.atom.atomStrings.Cursor = js.native
  @JSName("get")
  def get_autocompleteplussuppressActivationForEditorClasses(keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplussuppressActivationForEditorClasses(keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplususeCoreMovementCommands(keyPath: `autocomplete-plusDOTuseCoreMovementCommands`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplususeCoreMovementCommands(keyPath: `autocomplete-plusDOTuseCoreMovementCommands`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`): Boolean = js.native
  @JSName("get")
  def get_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems): Boolean = js.native
  @JSName("get")
  def get_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreaudioBeep(keyPath: coreDOTaudioBeep): Boolean = js.native
  @JSName("get")
  def get_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate): Boolean = js.native
  @JSName("get")
  def get_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs): Boolean = js.native
  @JSName("get")
  def get_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows): Boolean = js.native
  @JSName("get")
  def get_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corecolorProfile(keyPath: coreDOTcolorProfile): default | srgb = js.native
  @JSName("get")
  def get_corecolorProfile(keyPath: coreDOTcolorProfile, options: Anon_ExcludeSources): default | srgb = js.native
  @JSName("get")
  def get_corecustomFileTypes(keyPath: coreDOTcustomFileTypes): StringDictionary[js.Array[String]] = js.native
  @JSName("get")
  def get_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, options: Anon_ExcludeSources): StringDictionary[js.Array[String]] = js.native
  @JSName("get")
  def get_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes): Boolean = js.native
  @JSName("get")
  def get_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coredisabledPackages(keyPath: coreDOTdisabledPackages): js.Array[String] = js.native
  @JSName("get")
  def get_coredisabledPackages(keyPath: coreDOTdisabledPackages, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths): Boolean = js.native
  @JSName("get")
  def get_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corefileEncoding(keyPath: coreDOTfileEncoding): FileEncoding = js.native
  @JSName("get")
  def get_corefileEncoding(keyPath: coreDOTfileEncoding, options: Anon_ExcludeSources): FileEncoding = js.native
  @JSName("get")
  def get_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher): native | experimental | poll | typingsSlinky.atom.atomStrings.atom = js.native
  @JSName("get")
  def get_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, options: Anon_ExcludeSources): native | experimental | poll | typingsSlinky.atom.atomStrings.atom = js.native
  @JSName("get")
  def get_corefollowSymlinks(keyPath: coreDOTfollowSymlinks): Boolean = js.native
  @JSName("get")
  def get_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, options: Anon_ExcludeSources): Boolean = js.native
  // Managing Settings
  /** Retrieves the setting for the given key. */
  @JSName("get")
  def get_coreignoredNames(keyPath: coreDOTignoredNames): js.Array[String] = js.native
  @JSName("get")
  def get_coreignoredNames(keyPath: coreDOTignoredNames, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart): Boolean = js.native
  @JSName("get")
  def get_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount): Double = js.native
  @JSName("get")
  def get_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart): no | yes | always = js.native
  @JSName("get")
  def get_corerestorePreviousWindowsOnStart(keyPath: coreDOTrestorePreviousWindowsOnStart, options: Anon_ExcludeSources): no | yes | always = js.native
  @JSName("get")
  def get_coretelemetryConsent(keyPath: coreDOTtelemetryConsent): limited | no | undecided = js.native
  @JSName("get")
  def get_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, options: Anon_ExcludeSources): limited | no | undecided = js.native
  @JSName("get")
  def get_corethemes(keyPath: coreDOTthemes): js.Array[String] = js.native
  @JSName("get")
  def get_corethemes(keyPath: coreDOTthemes, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm): Boolean = js.native
  @JSName("get")
  def get_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers): Boolean = js.native
  @JSName("get")
  def get_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages): js.Array[String] = js.native
  @JSName("get")
  def get_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit): Double = js.native
  @JSName("get")
  def get_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs): Boolean = js.native
  @JSName("get")
  def get_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorautoIndent(keyPath: editorDOTautoIndent): Boolean = js.native
  @JSName("get")
  def get_editorautoIndent(keyPath: editorDOTautoIndent, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste): Boolean = js.native
  @JSName("get")
  def get_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorcommentEnd(keyPath: editorDOTcommentEnd): String | Null = js.native
  @JSName("get")
  def get_editorcommentEnd(keyPath: editorDOTcommentEnd, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorcommentStart(keyPath: editorDOTcommentStart): String | Null = js.native
  @JSName("get")
  def get_editorcommentStart(keyPath: editorDOTcommentStart, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision): Boolean = js.native
  @JSName("get")
  def get_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): String | Null = js.native
  @JSName("get")
  def get_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): String | Null = js.native
  @JSName("get")
  def get_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorfontFamily(keyPath: editorDOTfontFamily): String = js.native
  @JSName("get")
  def get_editorfontFamily(keyPath: editorDOTfontFamily, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_editorfontSize(keyPath: editorDOTfontSize): Double = js.native
  @JSName("get")
  def get_editorfontSize(keyPath: editorDOTfontSize, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): String | Null = js.native
  @JSName("get")
  def get_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, options: Anon_ExcludeSources): String | Null = js.native
  @JSName("get")
  def get_editorinvisibles(keyPath: editorDOTinvisibles): Invisibles = js.native
  @JSName("get")
  def get_editorinvisibles(keyPath: editorDOTinvisibles, options: Anon_ExcludeSources): Invisibles = js.native
  @JSName("get")
  def get_editorlineHeight(keyPath: editorDOTlineHeight): String | Double = js.native
  @JSName("get")
  def get_editorlineHeight(keyPath: editorDOTlineHeight, options: Anon_ExcludeSources): String | Double = js.native
  @JSName("get")
  def get_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength): Double = js.native
  @JSName("get")
  def get_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editornonWordCharacters(keyPath: editorDOTnonWordCharacters): String = js.native
  @JSName("get")
  def get_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength): Double = js.native
  @JSName("get")
  def get_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd): Boolean = js.native
  @JSName("get")
  def get_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity): Double = js.native
  @JSName("get")
  def get_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection): Boolean = js.native
  @JSName("get")
  def get_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide): Boolean = js.native
  @JSName("get")
  def get_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowInvisibles(keyPath: editorDOTshowInvisibles): Boolean = js.native
  @JSName("get")
  def get_editorshowInvisibles(keyPath: editorDOTshowInvisibles, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers): Boolean = js.native
  @JSName("get")
  def get_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftTabs(keyPath: editorDOTsoftTabs): Boolean = js.native
  @JSName("get")
  def get_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrap(keyPath: editorDOTsoftWrap): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent): Double = js.native
  @JSName("get")
  def get_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editortabLength(keyPath: editorDOTtabLength): Double = js.native
  @JSName("get")
  def get_editortabLength(keyPath: editorDOTtabLength, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editortabType(keyPath: editorDOTtabType): auto | soft | hard = js.native
  @JSName("get")
  def get_editortabType(keyPath: editorDOTtabType, options: Anon_ExcludeSources): auto | soft | hard = js.native
  @JSName("get")
  def get_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval): Double = js.native
  @JSName("get")
  def get_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling): Boolean = js.native
  @JSName("get")
  def get_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_linterdisabledProviders(keyPath: linterDOTdisabledProviders): js.Array[String] = js.native
  @JSName("get")
  def get_linterdisabledProviders(keyPath: linterDOTdisabledProviders, options: Anon_ExcludeSources): js.Array[String] = js.native
  @JSName("get")
  def get_linterignoreGlob(keyPath: linterDOTignoreGlob): String = js.native
  @JSName("get")
  def get_linterignoreGlob(keyPath: linterDOTignoreGlob, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_linterlintOnChange(keyPath: linterDOTlintOnChange): Boolean = js.native
  @JSName("get")
  def get_linterlintOnChange(keyPath: linterDOTlintOnChange, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval): Double = js.native
  @JSName("get")
  def get_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval, options: Anon_ExcludeSources): Double = js.native
  @JSName("get")
  def get_linterlintOnOpen(keyPath: linterDOTlintOnOpen): Boolean = js.native
  @JSName("get")
  def get_linterlintOnOpen(keyPath: linterDOTlintOnOpen, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs): Boolean = js.native
  @JSName("get")
  def get_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`): String = js.native
  @JSName("get")
  def get_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`, options: Anon_ExcludeSources): String = js.native
  @JSName("get")
  def get_statusbarfullWidth(keyPath: `status-barDOTfullWidth`): Boolean = js.native
  @JSName("get")
  def get_statusbarfullWidth(keyPath: `status-barDOTfullWidth`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_statusbarisVisible(keyPath: `status-barDOTisVisible`): Boolean = js.native
  @JSName("get")
  def get_statusbarisVisible(keyPath: `status-barDOTisVisible`, options: Anon_ExcludeSources): Boolean = js.native
  @JSName("get")
  def get_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`): String = js.native
  @JSName("get")
  def get_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`, options: Anon_ExcludeSources): String = js.native
  def observe(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    callback: js.Function1[
      /* value */ tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`), 
      Unit
    ]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    options: Anon_Scope,
    callback: js.Function1[
      /* value */ tab | enter | (`tab and enter`) | (`tab always, enter when suggestion explicitly selected`), 
      Unit
    ]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTdefaultProvider`,
    callback: js.Function1[/* value */ Subsequence | Symbol, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTdefaultProvider`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Subsequence | Symbol, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`,
    callback: js.Function1[/* value */ none | textOrSnippet, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ none | textOrSnippet, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTsuggestionListFollows`,
    callback: js.Function1[/* value */ Word | typingsSlinky.atom.atomStrings.Cursor, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: `autocomplete-plusDOTsuggestionListFollows`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Word | typingsSlinky.atom.atomStrings.Cursor, Unit]
  ): Disposable = js.native
  def observe(keyPath: coreDOTcolorProfile, callback: js.Function1[/* value */ default | srgb, Unit]): Disposable = js.native
  def observe(
    keyPath: coreDOTcolorProfile,
    options: Anon_Scope,
    callback: js.Function1[/* value */ default | srgb, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTfileSystemWatcher,
    callback: js.Function1[
      /* value */ native | experimental | poll | typingsSlinky.atom.atomStrings.atom, 
      Unit
    ]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTfileSystemWatcher,
    options: Anon_Scope,
    callback: js.Function1[
      /* value */ native | experimental | poll | typingsSlinky.atom.atomStrings.atom, 
      Unit
    ]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    callback: js.Function1[/* value */ no | yes | always, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ no | yes | always, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTtelemetryConsent,
    callback: js.Function1[/* value */ limited | no | undecided, Unit]
  ): Disposable = js.native
  def observe(
    keyPath: coreDOTtelemetryConsent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ limited | no | undecided, Unit]
  ): Disposable = js.native
  def observe(keyPath: editorDOTtabType, callback: js.Function1[/* value */ auto | soft | hard, Unit]): Disposable = js.native
  def observe(
    keyPath: editorDOTtabType,
    options: Anon_Scope,
    callback: js.Function1[/* value */ auto | soft | hard, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusautoActivationDelay(
    keyPath: `autocomplete-plusDOTautoActivationDelay`,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusautoActivationDelay(
    keyPath: `autocomplete-plusDOTautoActivationDelay`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusbackspaceTriggersAutocomplete(
    keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusbackspaceTriggersAutocomplete(
    keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusbuiltinProviderBlacklist(
    keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusbuiltinProviderBlacklist(
    keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusconsumeSuffix(
    keyPath: `autocomplete-plusDOTconsumeSuffix`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableAutoActivation(
    keyPath: `autocomplete-plusDOTenableAutoActivation`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableAutoActivation(
    keyPath: `autocomplete-plusDOTenableAutoActivation`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableBuiltinProvider(
    keyPath: `autocomplete-plusDOTenableBuiltinProvider`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableBuiltinProvider(
    keyPath: `autocomplete-plusDOTenableBuiltinProvider`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableExtendedUnicodeSupport(
    keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusenableExtendedUnicodeSupport(
    keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusfileBlacklist(
    keyPath: `autocomplete-plusDOTfileBlacklist`,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusfileBlacklist(
    keyPath: `autocomplete-plusDOTfileBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusincludeCompletionsFromAllBuffers(
    keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusincludeCompletionsFromAllBuffers(
    keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusmaxVisibleSuggestions(
    keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusmaxVisibleSuggestions(
    keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusminimumWordLength(
    keyPath: `autocomplete-plusDOTminimumWordLength`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusscopeBlacklist(
    keyPath: `autocomplete-plusDOTscopeBlacklist`,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusscopeBlacklist(
    keyPath: `autocomplete-plusDOTscopeBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplusstrictMatching(
    keyPath: `autocomplete-plusDOTstrictMatching`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeAlternateScoring(
    keyPath: `autocomplete-plusDOTuseAlternateScoring`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeAlternateScoring(
    keyPath: `autocomplete-plusDOTuseAlternateScoring`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeCoreMovementCommands(
    keyPath: `autocomplete-plusDOTuseCoreMovementCommands`,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeCoreMovementCommands(
    keyPath: `autocomplete-plusDOTuseCoreMovementCommands`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_autocompleteplususeLocalityBonus(
    keyPath: `autocomplete-plusDOTuseLocalityBonus`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreaudioBeep(keyPath: coreDOTaudioBeep, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreaudioBeep(keyPath: coreDOTaudioBeep, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    callback: js.Function1[/* value */ StringDictionary[js.Array[String]], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ StringDictionary[js.Array[String]], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coredisabledPackages(keyPath: coreDOTdisabledPackages, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coredisabledPackages(
    keyPath: coreDOTdisabledPackages,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corefileEncoding(keyPath: coreDOTfileEncoding, callback: js.Function1[/* value */ FileEncoding, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    options: Anon_Scope,
    callback: js.Function1[/* value */ FileEncoding, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  // Config Subscription
  /**
    *  Add a listener for changes to a given key path. This is different than ::onDidChange in
    *  that it will immediately call your callback with the current value of the config entry.
    */
  @JSName("observe")
  def observe_coreignoredNames(keyPath: coreDOTignoredNames, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. This is different than ::onDidChange in
    *  that it will immediately call your callback with the current value of the config entry.
    */
  @JSName("observe")
  def observe_coreignoredNames(
    keyPath: coreDOTignoredNames,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corethemes(keyPath: coreDOTthemes, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corethemes(
    keyPath: coreDOTthemes,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndent(keyPath: editorDOTautoIndent, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndent(
    keyPath: editorDOTautoIndent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentEnd(keyPath: editorDOTcommentEnd, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentEnd(
    keyPath: editorDOTcommentEnd,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentStart(keyPath: editorDOTcommentStart, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorcommentStart(
    keyPath: editorDOTcommentStart,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfontFamily(keyPath: editorDOTfontFamily, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfontFamily(
    keyPath: editorDOTfontFamily,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorfontSize(keyPath: editorDOTfontSize, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorfontSize(keyPath: editorDOTfontSize, options: Anon_Scope, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, callback: js.Function1[/* value */ String | Null, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Null, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorinvisibles(keyPath: editorDOTinvisibles, callback: js.Function1[/* value */ Invisibles, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorinvisibles(
    keyPath: editorDOTinvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Invisibles, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorlineHeight(keyPath: editorDOTlineHeight, callback: js.Function1[/* value */ String | Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorlineHeight(
    keyPath: editorDOTlineHeight,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String | Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowInvisibles(keyPath: editorDOTshowInvisibles, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftTabs(keyPath: editorDOTsoftTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftTabs(keyPath: editorDOTsoftTabs, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrap(keyPath: editorDOTsoftWrap, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrap(keyPath: editorDOTsoftWrap, options: Anon_Scope, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editortabLength(keyPath: editorDOTtabLength, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editortabLength(keyPath: editorDOTtabLength, options: Anon_Scope, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterdisabledProviders(keyPath: linterDOTdisabledProviders, callback: js.Function1[/* value */ js.Array[String], Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterdisabledProviders(
    keyPath: linterDOTdisabledProviders,
    options: Anon_Scope,
    callback: js.Function1[/* value */ js.Array[String], Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterignoreGlob(keyPath: linterDOTignoreGlob, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterignoreGlob(
    keyPath: linterDOTignoreGlob,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnChange(keyPath: linterDOTlintOnChange, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnChange(
    keyPath: linterDOTlintOnChange,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval, callback: js.Function1[/* value */ Double, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnChangeInterval(
    keyPath: linterDOTlintOnChangeInterval,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Double, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnOpen(keyPath: linterDOTlintOnOpen, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterlintOnOpen(
    keyPath: linterDOTlintOnOpen,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_linterlintPreviewTabs(
    keyPath: linterDOTlintPreviewTabs,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_statusbarcursorPositionFormat(
    keyPath: `status-barDOTcursorPositionFormat`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_statusbarfullWidth(keyPath: `status-barDOTfullWidth`, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_statusbarfullWidth(
    keyPath: `status-barDOTfullWidth`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_statusbarisVisible(keyPath: `status-barDOTisVisible`, callback: js.Function1[/* value */ Boolean, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_statusbarisVisible(
    keyPath: `status-barDOTisVisible`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ Boolean, Unit]
  ): Disposable = js.native
  @JSName("observe")
  def observe_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`, callback: js.Function1[/* value */ String, Unit]): Disposable = js.native
  @JSName("observe")
  def observe_statusbarselectionCountFormat(
    keyPath: `status-barDOTselectionCountFormat`,
    options: Anon_Scope,
    callback: js.Function1[/* value */ String, Unit]
  ): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  // tslint:disable-next-line:no-any
  def onDidChange[T](callback: js.Function1[/* values */ Anon_NewValue[T], Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusautoActivationDelay(
    keyPath: `autocomplete-plusDOTautoActivationDelay`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusautoActivationDelay(
    keyPath: `autocomplete-plusDOTautoActivationDelay`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusbackspaceTriggersAutocomplete(
    keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusbackspaceTriggersAutocomplete(
    keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusbuiltinProviderBlacklist(
    keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusbuiltinProviderBlacklist(
    keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusconfirmCompletion(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    callback: js.Function1[/* values */ Anon_Enter, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusconfirmCompletion(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Enter, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusconsumeSuffix(
    keyPath: `autocomplete-plusDOTconsumeSuffix`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusconsumeSuffix(
    keyPath: `autocomplete-plusDOTconsumeSuffix`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusdefaultProvider(
    keyPath: `autocomplete-plusDOTdefaultProvider`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueSubsequence, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusdefaultProvider(
    keyPath: `autocomplete-plusDOTdefaultProvider`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueSubsequence, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableAutoActivation(
    keyPath: `autocomplete-plusDOTenableAutoActivation`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableAutoActivation(
    keyPath: `autocomplete-plusDOTenableAutoActivation`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableBuiltinProvider(
    keyPath: `autocomplete-plusDOTenableBuiltinProvider`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableBuiltinProvider(
    keyPath: `autocomplete-plusDOTenableBuiltinProvider`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableExtendedUnicodeSupport(
    keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusenableExtendedUnicodeSupport(
    keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusfileBlacklist(
    keyPath: `autocomplete-plusDOTfileBlacklist`,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusfileBlacklist(
    keyPath: `autocomplete-plusDOTfileBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusincludeCompletionsFromAllBuffers(
    keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusincludeCompletionsFromAllBuffers(
    keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusmaxVisibleSuggestions(
    keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusmaxVisibleSuggestions(
    keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusminimumWordLength(
    keyPath: `autocomplete-plusDOTminimumWordLength`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusminimumWordLength(
    keyPath: `autocomplete-plusDOTminimumWordLength`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusscopeBlacklist(
    keyPath: `autocomplete-plusDOTscopeBlacklist`,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusscopeBlacklist(
    keyPath: `autocomplete-plusDOTscopeBlacklist`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussimilarSuggestionRemoval(
    keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`,
    callback: js.Function1[/* values */ Anon_NewValueNone, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussimilarSuggestionRemoval(
    keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueNone, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusstrictMatching(
    keyPath: `autocomplete-plusDOTstrictMatching`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplusstrictMatching(
    keyPath: `autocomplete-plusDOTstrictMatching`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussuggestionListFollows(
    keyPath: `autocomplete-plusDOTsuggestionListFollows`,
    callback: js.Function1[/* values */ Anon_Cursor, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussuggestionListFollows(
    keyPath: `autocomplete-plusDOTsuggestionListFollows`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Cursor, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeAlternateScoring(
    keyPath: `autocomplete-plusDOTuseAlternateScoring`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeAlternateScoring(
    keyPath: `autocomplete-plusDOTuseAlternateScoring`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeCoreMovementCommands(
    keyPath: `autocomplete-plusDOTuseCoreMovementCommands`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeCoreMovementCommands(
    keyPath: `autocomplete-plusDOTuseCoreMovementCommands`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeLocalityBonus(
    keyPath: `autocomplete-plusDOTuseLocalityBonus`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_autocompleteplususeLocalityBonus(
    keyPath: `autocomplete-plusDOTuseLocalityBonus`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreallowPendingPaneItems(
    keyPath: coreDOTallowPendingPaneItems,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreaudioBeep(keyPath: coreDOTaudioBeep, callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreaudioBeep(
    keyPath: coreDOTaudioBeep,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreautomaticallyUpdate(
    keyPath: coreDOTautomaticallyUpdate,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseDeletedFileTabs(
    keyPath: coreDOTcloseDeletedFileTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecloseEmptyWindows(
    keyPath: coreDOTcloseEmptyWindows,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecolorProfile(keyPath: coreDOTcolorProfile, callback: js.Function1[/* values */ Anon_Default, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecolorProfile(
    keyPath: coreDOTcolorProfile,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Default, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, callback: js.Function1[/* values */ Anon_Key, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Key, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredestroyEmptyPanes(
    keyPath: coreDOTdestroyEmptyPanes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredisabledPackages(keyPath: coreDOTdisabledPackages, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coredisabledPackages(
    keyPath: coreDOTdisabledPackages,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreexcludeVcsIgnoredPaths(
    keyPath: coreDOTexcludeVcsIgnoredPaths,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    callback: js.Function1[/* values */ Anon_NewValueOldValueFileEncoding, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileEncoding(
    keyPath: coreDOTfileEncoding,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueFileEncoding, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileSystemWatcher(keyPath: coreDOTfileSystemWatcher, callback: js.Function1[/* values */ Anon_Atom, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefileSystemWatcher(
    keyPath: coreDOTfileSystemWatcher,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Atom, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corefollowSymlinks(
    keyPath: coreDOTfollowSymlinks,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  @JSName("onDidChange")
  def onDidChange_coreignoredNames(keyPath: coreDOTignoredNames, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  /**
    *  Add a listener for changes to a given key path. If keyPath is not specified, your
    *  callback will be called on changes to any key.
    */
  @JSName("onDidChange")
  def onDidChange_coreignoredNames(
    keyPath: coreDOTignoredNames,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreopenEmptyEditorOnStart(
    keyPath: coreDOTopenEmptyEditorOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corereopenProjectMenuCount(
    keyPath: coreDOTreopenProjectMenuCount,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corerestorePreviousWindowsOnStart(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    callback: js.Function1[/* values */ Anon_Always, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corerestorePreviousWindowsOnStart(
    keyPath: coreDOTrestorePreviousWindowsOnStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Always, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coretelemetryConsent(keyPath: coreDOTtelemetryConsent, callback: js.Function1[/* values */ Anon_Limited, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coretelemetryConsent(
    keyPath: coreDOTtelemetryConsent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Limited, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corethemes(keyPath: coreDOTthemes, callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corethemes(
    keyPath: coreDOTthemes,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseProxySettingsWhenCallingApm(
    keyPath: coreDOTuseProxySettingsWhenCallingApm,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreuseTreeSitterParsers(
    keyPath: coreDOTuseTreeSitterParsers,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_coreversionPinnedPackages(
    keyPath: coreDOTversionPinnedPackages,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_corewarnOnLargeFileLimit(
    keyPath: coreDOTwarnOnLargeFileLimit,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editoratomicSoftTabs(
    keyPath: editorDOTatomicSoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndent(
    keyPath: editorDOTautoIndent,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndent(
    keyPath: editorDOTautoIndent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorautoIndentOnPaste(
    keyPath: editorDOTautoIndentOnPaste,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentEnd(keyPath: editorDOTcommentEnd, callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentEnd(
    keyPath: editorDOTcommentEnd,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentStart(
    keyPath: editorDOTcommentStart,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorcommentStart(
    keyPath: editorDOTcommentStart,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorconfirmCheckoutHeadRevision(
    keyPath: editorDOTconfirmCheckoutHeadRevision,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editordecreaseIndentPattern(
    keyPath: editorDOTdecreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfoldEndPattern(
    keyPath: editorDOTfoldEndPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontFamily(
    keyPath: editorDOTfontFamily,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontFamily(
    keyPath: editorDOTfontFamily,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontSize(keyPath: editorDOTfontSize, callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorfontSize(
    keyPath: editorDOTfontSize,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorincreaseIndentPattern(
    keyPath: editorDOTincreaseIndentPattern,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNull, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorinvisibles(
    keyPath: editorDOTinvisibles,
    callback: js.Function1[/* values */ Anon_NewValueOldValueInvisibles, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorinvisibles(
    keyPath: editorDOTinvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueInvisibles, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorlineHeight(
    keyPath: editorDOTlineHeight,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumberString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorlineHeight(
    keyPath: editorDOTlineHeight,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumberString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editormaxScreenLineLength(
    keyPath: editorDOTmaxScreenLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editornonWordCharacters(
    keyPath: editorDOTnonWordCharacters,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorpreferredLineLength(
    keyPath: editorDOTpreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollPastEnd(
    keyPath: editorDOTscrollPastEnd,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorscrollSensitivity(
    keyPath: editorDOTscrollSensitivity,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowCursorOnSelection(
    keyPath: editorDOTshowCursorOnSelection,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowIndentGuide(
    keyPath: editorDOTshowIndentGuide,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowInvisibles(
    keyPath: editorDOTshowInvisibles,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorshowLineNumbers(
    keyPath: editorDOTshowLineNumbers,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftTabs(
    keyPath: editorDOTsoftTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftTabs(
    keyPath: editorDOTsoftTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrap(
    keyPath: editorDOTsoftWrap,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrap(
    keyPath: editorDOTsoftWrap,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapAtPreferredLineLength(
    keyPath: editorDOTsoftWrapAtPreferredLineLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorsoftWrapHangingIndent(
    keyPath: editorDOTsoftWrapHangingIndent,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabLength(
    keyPath: editorDOTtabLength,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabLength(
    keyPath: editorDOTtabLength,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabType(keyPath: editorDOTtabType, callback: js.Function1[/* values */ Anon_Auto, Unit]): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editortabType(
    keyPath: editorDOTtabType,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_Auto, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorundoGroupingInterval(
    keyPath: editorDOTundoGroupingInterval,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_editorzoomFontWhenCtrlScrolling(
    keyPath: editorDOTzoomFontWhenCtrlScrolling,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterdisabledProviders(
    keyPath: linterDOTdisabledProviders,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterdisabledProviders(
    keyPath: linterDOTdisabledProviders,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValue, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterignoreGlob(
    keyPath: linterDOTignoreGlob,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterignoreGlob(
    keyPath: linterDOTignoreGlob,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnChange(
    keyPath: linterDOTlintOnChange,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnChange(
    keyPath: linterDOTlintOnChange,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnChangeInterval(
    keyPath: linterDOTlintOnChangeInterval,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnChangeInterval(
    keyPath: linterDOTlintOnChangeInterval,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueNumber, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnOpen(
    keyPath: linterDOTlintOnOpen,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintOnOpen(
    keyPath: linterDOTlintOnOpen,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintPreviewTabs(
    keyPath: linterDOTlintPreviewTabs,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_linterlintPreviewTabs(
    keyPath: linterDOTlintPreviewTabs,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarcursorPositionFormat(
    keyPath: `status-barDOTcursorPositionFormat`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarcursorPositionFormat(
    keyPath: `status-barDOTcursorPositionFormat`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarfullWidth(
    keyPath: `status-barDOTfullWidth`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarfullWidth(
    keyPath: `status-barDOTfullWidth`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarisVisible(
    keyPath: `status-barDOTisVisible`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarisVisible(
    keyPath: `status-barDOTisVisible`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueBoolean, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarselectionCountFormat(
    keyPath: `status-barDOTselectionCountFormat`,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  @JSName("onDidChange")
  def onDidChange_statusbarselectionCountFormat(
    keyPath: `status-barDOTselectionCountFormat`,
    options: Anon_Scope,
    callback: js.Function1[/* values */ Anon_NewValueOldValueString, Unit]
  ): Disposable = js.native
  def set(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    value: `tab always, enter when suggestion explicitly selected`
  ): Unit = js.native
  def set(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    value: `tab always, enter when suggestion explicitly selected`,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTconfirmCompletion`, value: `tab and enter`): Unit = js.native
  def set(
    keyPath: `autocomplete-plusDOTconfirmCompletion`,
    value: `tab and enter`,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTconfirmCompletion`, value: enter): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTconfirmCompletion`, value: enter, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTconfirmCompletion`, value: tab): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTconfirmCompletion`, value: tab, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTdefaultProvider`, value: Subsequence): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTdefaultProvider`, value: Subsequence, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTdefaultProvider`, value: Symbol): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTdefaultProvider`, value: Symbol, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`, value: none): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`, value: none, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`, value: textOrSnippet): Unit = js.native
  def set(
    keyPath: `autocomplete-plusDOTsimilarSuggestionRemoval`,
    value: textOrSnippet,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsuggestionListFollows`, value: typingsSlinky.atom.atomStrings.Cursor): Unit = js.native
  def set(
    keyPath: `autocomplete-plusDOTsuggestionListFollows`,
    value: typingsSlinky.atom.atomStrings.Cursor,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsuggestionListFollows`, value: Word): Unit = js.native
  def set(keyPath: `autocomplete-plusDOTsuggestionListFollows`, value: Word, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: default): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: default, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: srgb): Unit = js.native
  def set(keyPath: coreDOTcolorProfile, value: srgb, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: typingsSlinky.atom.atomStrings.atom): Unit = js.native
  def set(
    keyPath: coreDOTfileSystemWatcher,
    value: typingsSlinky.atom.atomStrings.atom,
    options: Anon_ScopeSelector
  ): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: experimental): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: experimental, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: native): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: native, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: poll): Unit = js.native
  def set(keyPath: coreDOTfileSystemWatcher, value: poll, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: always): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: always, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: no): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: no, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: yes): Unit = js.native
  def set(keyPath: coreDOTrestorePreviousWindowsOnStart, value: yes, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: limited): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: limited, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: no): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: no, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: undecided): Unit = js.native
  def set(keyPath: coreDOTtelemetryConsent, value: undecided, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: auto): Unit = js.native
  def set(keyPath: editorDOTtabType, value: auto, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: hard): Unit = js.native
  def set(keyPath: editorDOTtabType, value: hard, options: Anon_ScopeSelector): Unit = js.native
  def set(keyPath: editorDOTtabType, value: soft): Unit = js.native
  def set(keyPath: editorDOTtabType, value: soft, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`, value: Double): Unit = js.native
  @JSName("set")
  def set_autocompleteplusautoActivationDelay(keyPath: `autocomplete-plusDOTautoActivationDelay`, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusbackspaceTriggersAutocomplete(keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusbackspaceTriggersAutocomplete(
    keyPath: `autocomplete-plusDOTbackspaceTriggersAutocomplete`,
    value: Boolean,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusbuiltinProviderBlacklist(keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`, value: String): Unit = js.native
  @JSName("set")
  def set_autocompleteplusbuiltinProviderBlacklist(
    keyPath: `autocomplete-plusDOTbuiltinProviderBlacklist`,
    value: String,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusconsumeSuffix(keyPath: `autocomplete-plusDOTconsumeSuffix`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableAutoActivation(keyPath: `autocomplete-plusDOTenableAutoActivation`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableAutoConfirmSingleSuggestion(keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableAutoConfirmSingleSuggestion(
    keyPath: `autocomplete-plusDOTenableAutoConfirmSingleSuggestion`,
    value: Boolean,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableBuiltinProvider(keyPath: `autocomplete-plusDOTenableBuiltinProvider`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableExtendedUnicodeSupport(keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusenableExtendedUnicodeSupport(
    keyPath: `autocomplete-plusDOTenableExtendedUnicodeSupport`,
    value: Boolean,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_autocompleteplusfileBlacklist(keyPath: `autocomplete-plusDOTfileBlacklist`, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusincludeCompletionsFromAllBuffers(keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusincludeCompletionsFromAllBuffers(
    keyPath: `autocomplete-plusDOTincludeCompletionsFromAllBuffers`,
    value: Boolean,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`, value: Double): Unit = js.native
  @JSName("set")
  def set_autocompleteplusmaxVisibleSuggestions(keyPath: `autocomplete-plusDOTmaxVisibleSuggestions`, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`, value: Double): Unit = js.native
  @JSName("set")
  def set_autocompleteplusminimumWordLength(keyPath: `autocomplete-plusDOTminimumWordLength`, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplusscopeBlacklist(keyPath: `autocomplete-plusDOTscopeBlacklist`, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_autocompleteplusscopeBlacklist(
    keyPath: `autocomplete-plusDOTscopeBlacklist`,
    value: js.Array[String],
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplusstrictMatching(keyPath: `autocomplete-plusDOTstrictMatching`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplussuppressActivationForEditorClasses(keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_autocompleteplussuppressActivationForEditorClasses(
    keyPath: `autocomplete-plusDOTsuppressActivationForEditorClasses`,
    value: js.Array[String],
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeAlternateScoring(keyPath: `autocomplete-plusDOTuseAlternateScoring`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeCoreMovementCommands(keyPath: `autocomplete-plusDOTuseCoreMovementCommands`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeCoreMovementCommands(
    keyPath: `autocomplete-plusDOTuseCoreMovementCommands`,
    value: Boolean,
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autocompleteplususeLocalityBonus(keyPath: `autocomplete-plusDOTuseLocalityBonus`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreallowPendingPaneItems(keyPath: coreDOTallowPendingPaneItems, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreaudioBeep(keyPath: coreDOTaudioBeep, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreaudioBeep(keyPath: coreDOTaudioBeep, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreautomaticallyUpdate(keyPath: coreDOTautomaticallyUpdate, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corecloseDeletedFileTabs(keyPath: coreDOTcloseDeletedFileTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corecloseEmptyWindows(keyPath: coreDOTcloseEmptyWindows, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corecustomFileTypes(keyPath: coreDOTcustomFileTypes, value: StringDictionary[js.Array[String]]): Unit = js.native
  @JSName("set")
  def set_corecustomFileTypes(
    keyPath: coreDOTcustomFileTypes,
    value: StringDictionary[js.Array[String]],
    options: Anon_ScopeSelector
  ): Unit = js.native
  @JSName("set")
  def set_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coredestroyEmptyPanes(keyPath: coreDOTdestroyEmptyPanes, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coredisabledPackages(keyPath: coreDOTdisabledPackages, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coredisabledPackages(keyPath: coreDOTdisabledPackages, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreexcludeVcsIgnoredPaths(keyPath: coreDOTexcludeVcsIgnoredPaths, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corefileEncoding(keyPath: coreDOTfileEncoding, value: FileEncoding): Unit = js.native
  @JSName("set")
  def set_corefileEncoding(keyPath: coreDOTfileEncoding, value: FileEncoding, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, value: Boolean): Unit = js.native
  @JSName("set")
  def set_corefollowSymlinks(keyPath: coreDOTfollowSymlinks, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  /**
    *  Sets the value for a configuration setting.
    *  This value is stored in Atom's internal configuration file.
    */
  @JSName("set")
  def set_coreignoredNames(keyPath: coreDOTignoredNames, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coreignoredNames(keyPath: coreDOTignoredNames, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreopenEmptyEditorOnStart(keyPath: coreDOTopenEmptyEditorOnStart, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, value: Double): Unit = js.native
  @JSName("set")
  def set_corereopenProjectMenuCount(keyPath: coreDOTreopenProjectMenuCount, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corethemes(keyPath: coreDOTthemes, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_corethemes(keyPath: coreDOTthemes, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreuseProxySettingsWhenCallingApm(keyPath: coreDOTuseProxySettingsWhenCallingApm, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, value: Boolean): Unit = js.native
  @JSName("set")
  def set_coreuseTreeSitterParsers(keyPath: coreDOTuseTreeSitterParsers, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_coreversionPinnedPackages(keyPath: coreDOTversionPinnedPackages, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, value: Double): Unit = js.native
  @JSName("set")
  def set_corewarnOnLargeFileLimit(keyPath: coreDOTwarnOnLargeFileLimit, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editoratomicSoftTabs(keyPath: editorDOTatomicSoftTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorautoIndent(keyPath: editorDOTautoIndent, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorautoIndent(keyPath: editorDOTautoIndent, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorautoIndentOnPaste(keyPath: editorDOTautoIndentOnPaste, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: String): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentEnd(keyPath: editorDOTcommentEnd, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: String): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorcommentStart(keyPath: editorDOTcommentStart, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorconfirmCheckoutHeadRevision(keyPath: editorDOTconfirmCheckoutHeadRevision, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editordecreaseIndentPattern(keyPath: editorDOTdecreaseIndentPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfoldEndPattern(keyPath: editorDOTfoldEndPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfontFamily(keyPath: editorDOTfontFamily, value: String): Unit = js.native
  @JSName("set")
  def set_editorfontFamily(keyPath: editorDOTfontFamily, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorfontSize(keyPath: editorDOTfontSize, value: Double): Unit = js.native
  @JSName("set")
  def set_editorfontSize(keyPath: editorDOTfontSize, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: String): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorincreaseIndentPattern(keyPath: editorDOTincreaseIndentPattern, value: Null, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorinvisibles(keyPath: editorDOTinvisibles, value: Invisibles): Unit = js.native
  @JSName("set")
  def set_editorinvisibles(keyPath: editorDOTinvisibles, value: Invisibles, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: String): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_editorlineHeight(keyPath: editorDOTlineHeight, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editormaxScreenLineLength(keyPath: editorDOTmaxScreenLineLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, value: String): Unit = js.native
  @JSName("set")
  def set_editornonWordCharacters(keyPath: editorDOTnonWordCharacters, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editorpreferredLineLength(keyPath: editorDOTpreferredLineLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorscrollPastEnd(keyPath: editorDOTscrollPastEnd, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, value: Double): Unit = js.native
  @JSName("set")
  def set_editorscrollSensitivity(keyPath: editorDOTscrollSensitivity, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowCursorOnSelection(keyPath: editorDOTshowCursorOnSelection, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowIndentGuide(keyPath: editorDOTshowIndentGuide, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowInvisibles(keyPath: editorDOTshowInvisibles, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowInvisibles(keyPath: editorDOTshowInvisibles, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorshowLineNumbers(keyPath: editorDOTshowLineNumbers, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftTabs(keyPath: editorDOTsoftTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftTabs(keyPath: editorDOTsoftTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrap(keyPath: editorDOTsoftWrap, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftWrap(keyPath: editorDOTsoftWrap, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapAtPreferredLineLength(keyPath: editorDOTsoftWrapAtPreferredLineLength, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, value: Double): Unit = js.native
  @JSName("set")
  def set_editorsoftWrapHangingIndent(keyPath: editorDOTsoftWrapHangingIndent, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editortabLength(keyPath: editorDOTtabLength, value: Double): Unit = js.native
  @JSName("set")
  def set_editortabLength(keyPath: editorDOTtabLength, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_editorundoGroupingInterval(keyPath: editorDOTundoGroupingInterval, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editorzoomFontWhenCtrlScrolling(keyPath: editorDOTzoomFontWhenCtrlScrolling, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterdisabledProviders(keyPath: linterDOTdisabledProviders, value: js.Array[String]): Unit = js.native
  @JSName("set")
  def set_linterdisabledProviders(keyPath: linterDOTdisabledProviders, value: js.Array[String], options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterignoreGlob(keyPath: linterDOTignoreGlob, value: String): Unit = js.native
  @JSName("set")
  def set_linterignoreGlob(keyPath: linterDOTignoreGlob, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterlintOnChange(keyPath: linterDOTlintOnChange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_linterlintOnChange(keyPath: linterDOTlintOnChange, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_linterlintOnChangeInterval(keyPath: linterDOTlintOnChangeInterval, value: Double, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterlintOnOpen(keyPath: linterDOTlintOnOpen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_linterlintOnOpen(keyPath: linterDOTlintOnOpen, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs, value: Boolean): Unit = js.native
  @JSName("set")
  def set_linterlintPreviewTabs(keyPath: linterDOTlintPreviewTabs, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`, value: String): Unit = js.native
  @JSName("set")
  def set_statusbarcursorPositionFormat(keyPath: `status-barDOTcursorPositionFormat`, value: String, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_statusbarfullWidth(keyPath: `status-barDOTfullWidth`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_statusbarfullWidth(keyPath: `status-barDOTfullWidth`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_statusbarisVisible(keyPath: `status-barDOTisVisible`, value: Boolean): Unit = js.native
  @JSName("set")
  def set_statusbarisVisible(keyPath: `status-barDOTisVisible`, value: Boolean, options: Anon_ScopeSelector): Unit = js.native
  @JSName("set")
  def set_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`, value: String): Unit = js.native
  @JSName("set")
  def set_statusbarselectionCountFormat(keyPath: `status-barDOTselectionCountFormat`, value: String, options: Anon_ScopeSelector): Unit = js.native
  /**
    *  Suppress calls to handler functions registered with ::onDidChange and ::observe
    *  for the duration of callback. After callback executes, handlers will be called
    *  once if the value for their key-path has changed.
    */
  def transact(callback: js.Function0[Unit]): Unit = js.native
  /** Restore the setting at keyPath to its default value. */
  def unset(keyPath: String): Unit = js.native
  def unset(keyPath: String, options: Anon_ScopeSelector): Unit = js.native
}

