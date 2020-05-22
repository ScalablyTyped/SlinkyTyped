organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-20782d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20200515Z-a3447b",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20200515Z-d9eeaf",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20200515Z-a490b2",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20200515Z-540947",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-33a4b7",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20200515Z-d3a1a1",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20200518Z-2ed66a",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20200515Z-c75c5c",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20200515Z-9eb8be",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20200515Z-890766",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-3d4f18",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20200515Z-b549f5",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20200515Z-196959",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20200515Z-bf597a",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20200515Z-30f829",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-7c6fbd",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20200515Z-d87863",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20200515Z-2ffb13",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20200515Z-1ed588",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20200515Z-2d1db9",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20200515Z-c0ba43",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20200515Z-b5abb6",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20200515Z-272ddf",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-5ca6fa",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20200515Z-955ba6",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-07b1dd",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-608f74",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-d59d1b",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20200515Z-096ad2",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20200515Z-960d8e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
