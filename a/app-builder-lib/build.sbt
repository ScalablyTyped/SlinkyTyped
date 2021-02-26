organization := "org.scalablytyped.slinky"
name := "app-builder-lib"
version := "22.9.1-614704"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "builder-util" % "22.9.1-69ddb5",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.7.2-09ab43",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-1fc0b4",
  "org.scalablytyped.slinky" %%% "electron-publish" % "22.9.1-5c1022",
  "org.scalablytyped.slinky" %%% "fs-extra" % "9.0-dt-20201111Z-62f568",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-3ef348",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.7-5af4bc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
