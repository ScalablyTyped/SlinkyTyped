organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-01fdbc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20190213Z-0ffed5",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-f8744b",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20191126Z-3ef169",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20191126Z-891ecc",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-e8be34",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20191126Z-1bc6fa",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20191126Z-ae5651",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-3556e9",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20191126Z-942b86",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20191126Z-3d9b5f",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-9e00d7",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-99917c",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20191126Z-11318e",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20191126Z-c103db",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20191126Z-421505",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-f28d7f",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-c9864e",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20191126Z-c7b108",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-097dde",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20191126Z-6b5b4e",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-9020bd",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20191126Z-bf96c5",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20191126Z-84fb22",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-4a63f3",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20191126Z-ab6bd9",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-f9cac7",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-f1ed60",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-c198f0",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20191126Z-ab4b15",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20191126Z-1eecda",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
