organization := "org.scalablytyped.slinky"
name := "electron-publish"
version := "22.9.1-33b5f7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "builder-util" % "22.9.1-419adb",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.7.2-26cbc7",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-794065",
  "org.scalablytyped.slinky" %%% "fs-extra" % "9.0-dt-20201111Z-757cdd",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-513ef3",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.7-622802")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
